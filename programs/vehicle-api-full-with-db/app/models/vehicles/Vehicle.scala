package models.vehicles

import play.api.libs.json.Json

import scala.collection.mutable.ListBuffer

case class Vehicle (var sNo:Int,var name:String,var manufacturer:String,var year:Int,var fuelType:String,var transmission:String)

object Vehicle{
  implicit val writes = Json.writes[Vehicle]
  implicit val reads = Json.reads[Vehicle]


    var vehicles = ListBuffer.empty ++ VehicleService.getAllVehicles()


    def all(): List[Vehicle] = {
      vehicles.toList
    }

    def create(vehicle: Vehicle): Unit = {
      vehicles += vehicle
    }


    def getById(id: Long): Vehicle = {
      vehicles.find(_.sNo == id).getOrElse(null)
    }


    def delete(id: Long): Unit = {
      vehicles -= getById(id)
    }


}