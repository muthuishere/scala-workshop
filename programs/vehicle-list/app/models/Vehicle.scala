package models

import providers.VehicleMockDataProvider

import scala.collection.mutable.ListBuffer

case class Vehicle (var sNo:Int,var name:String,var manufacturer:String,var year:Int,var fuelType:String,var transmission:String)

object Vehicle{

  var vehicles:ListBuffer[Vehicle] = ListBuffer.empty ++ VehicleMockDataProvider.getAllVehicles()

  def list(): List[Vehicle] = {
   return vehicles.toList
  }
  def create(vehicle:Vehicle) ={
    vehicles += vehicle
  }
}