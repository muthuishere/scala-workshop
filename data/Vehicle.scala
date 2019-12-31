package functional



class Vehicle (var sNo:Int,var name:String,var manufacturer:String,var year:Int,var fuelType:String,var transmission:String){


  override def toString = s"Vehicle($sNo, $name, $manufacturer, $year, $fuelType, $transmission)"
}