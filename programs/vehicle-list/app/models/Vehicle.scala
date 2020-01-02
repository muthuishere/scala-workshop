package models

import providers.VehicleMockDataProvider

case class Vehicle (var sNo:Int,var name:String,var manufacturer:String,var year:Int,var fuelType:String,var transmission:String)

object Vehicle{

  var vehicles = VehicleMockDataProvider.getAllVehicles()

  def list(): List[Vehicle] = {
   return vehicles
  }
}