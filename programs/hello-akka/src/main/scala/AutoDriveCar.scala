import akka.actor.{Actor, ActorRef, ActorSystem, Props}
import akka.actor._

/*
  Administrator
    Start
    Drive
    ChangeGear
    Stop
  Engine
    UpdateSpeedoMeter

  Speedometer
      ShowSpeed
 */
case object StartMessage
case object StartEngineMessage
case object StopEngineMessage
case object StopSpeedoMeterMessage
case object DriveMessage
case object IncreaseGearMessage
case object DecreaseGearMessage
case object UnableToChangeGearMessage
case object ChangedGearMessage
case object StopMessage
case object UpdateSpeedoMeterMessage{
  var speed:Int=0
}

class SpeedoMeter extends Actor {
  def receive = {
    case UpdateSpeedoMeterMessage =>
      println("  updating Speedometer with " + UpdateSpeedoMeterMessage.speed)
    case StopMessage =>
      println("Stopping  Speedometer")
     // context.stop(self)
  }
}

class Engine(speedoMeter: ActorRef) extends Actor {
  var currentGear = 0




  def IncreaseGear { currentGear += 1; println(s"Current Gear => $currentGear" ) }
  def DecreaseGear { currentGear -= 1; println(s"Current Gear => $currentGear" ) }


  def receive = {
    case StartEngineMessage =>
       println(Thread.currentThread().getName() +"Starting Engine ")
      currentGear=0

    case StopEngineMessage =>
      speedoMeter!StopSpeedoMeterMessage
       println("Stopping  Engine")
    case DriveMessage =>
      UpdateSpeedoMeterMessage.speed=currentGear *30
      speedoMeter!UpdateSpeedoMeterMessage

    case DecreaseGearMessage =>

      if (currentGear < 0) {
        sender ! UnableToChangeGearMessage

      } else {
        DecreaseGear
        sender ! ChangedGearMessage
      }
    case IncreaseGearMessage =>

      if (currentGear > 4) {
        sender ! UnableToChangeGearMessage

        //context.stop(self)
      } else {
        IncreaseGear
        sender ! ChangedGearMessage
      }
  }
}

class Administrator(engine: ActorRef)  extends Actor {
  def receive = {
    case StartMessage =>
      println(Thread.currentThread().getName() +"Starting ")
      engine ! StartEngineMessage
      engine ! IncreaseGearMessage
    case DriveMessage =>
        engine ! DriveMessage
    case UnableToChangeGearMessage =>
      println( Thread.currentThread().getName() + "  UnableToChangeGearMessage")

    case ChangedGearMessage =>
      println(Thread.currentThread().getName() +"  ChangedGearMessage")

    case StopMessage =>
      engine ! StopMessage
      println("Stopping Engine")
    //  context.stop(self)
  }
}

object AutoDriveCar extends App {
  val system = ActorSystem("AutoDriveVehicle")

  val speedoMeter = system.actorOf(Props[SpeedoMeter], name = "speedoMeter")
  val engine = system.actorOf(Props(new Engine(speedoMeter)), name = "engine")
  val administrator = system.actorOf(Props(new Administrator(engine)), name = "administrator")
  // start them going
  administrator ! StartMessage
  administrator !DriveMessage

}

