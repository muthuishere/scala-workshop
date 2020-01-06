package models.vehicles

import anorm._
import javax.inject.Inject
import models.DatabaseExecutionContext
import play.api.db.DBApi

import scala.concurrent.Future


@javax.inject.Singleton
class VehicleRepository @Inject()(dbapi: DBApi)(implicit ec: DatabaseExecutionContext) {

  private val db = dbapi.database("default")

  val parser: RowParser[Vehicle] = Macro.namedParser[Vehicle]

  def list(): Future[List[Vehicle]] = Future {


    db.withConnection { implicit connection =>



      val result: List[Vehicle] = SQL"SELECT * FROM VEHICLE".as(parser.*)
      result
    }
  }(ec)

  //case class Vehicle (var sNo:Int,var name:String,var manufacturer:String,var year:Int,var fuelType:String,var transmission:String)

  def insert(vehicle: Vehicle): Option[Long] = {
    val id: Option[Long] = db.withConnection { implicit c =>
      SQL("""INSERT INTO VEHICLE ( "NAME",  "MANUFACTURER", "YEAR", "FUELTYPE", "TRANSMISSION") VALUES ({name},{manufacturer},{year},{fuelType},{transmission})""")
        .on("name" -> vehicle.name,"manufacturer" -> vehicle.manufacturer,"year" -> vehicle.year,"fuelType" -> vehicle.fuelType,"transmission" -> vehicle.transmission)
        .executeInsert()
    }

//    val id: Option[Long] = db.withConnection { implicit c =>
//      SQL("""INSERT INTO VEHICLE ("SNO", "NAME",  "MANUFACTURER", "YEAR", "FUELTYPE", "TRANSMISSION") VALUES ({sNo},{name},{manufacturer},{year},{fuelType},{transmission})""")
//        .on("sNo" -> vehicle.sNo,"name" -> vehicle.name,"manufacturer" -> vehicle.manufacturer,"year" -> vehicle.year,"fuelType" -> vehicle.fuelType,"transmission" -> vehicle.transmission)
//        .executeInsert()
//    }
    id
  }

  def insertAll(vehicles:List[Vehicle]): Future[List[Vehicle]] = Future {

    vehicles.foreach(vehicle=>insert(vehicle))

    null
  }(ec)


}