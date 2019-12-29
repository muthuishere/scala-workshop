package functional



class Car (var sNo:Int,var name:String,var manufacturer:String,var year:Int,var fuelType:String,var transmission:String){


  override def toString = s"Car($sNo, $name, $manufacturer, $year, $fuelType, $transmission)"
}