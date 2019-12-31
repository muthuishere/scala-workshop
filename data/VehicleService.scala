package functional


import scala.collection.mutable.ListBuffer

object VehicleService {

  def getAllVehicles():List[Vehicle] ={
    var vehicles = new ListBuffer[Vehicle]()
    vehicles += new Vehicle(1,"Volvo XC40  ","Volvo",2017,"Diesel","Automatic");
    vehicles += new Vehicle(2,"Volvo XC60  ","Volvo",2017,"Diesel","Automatic");
    vehicles += new Vehicle(3,"Volvo V90 Cross Country  ","Volvo",2016,"Diesel","Automatic");
    vehicles += new Vehicle(4,"Volvo S60 Polestar  ","Volvo",2010,"Diesel","Automatic");
    vehicles += new Vehicle(5,"Volvo S90  ","Volvo",2016,"Diesel","Automatic");
    vehicles += new Vehicle(6,"Volvo XC90 Excellence  ","Volvo",2015,"Diesel","Automatic");
    vehicles += new Vehicle(7,"Volvo XC90 Excellence Lounge  ","Volvo",2015,"Diesel","Automatic");
    vehicles += new Vehicle(8,"Volvo XC90   ","Volvo",2015,"Diesel","Automatic");
    vehicles += new Vehicle(9,"Volvo S60","Volvo",2010,"Diesel","Automatic");
    vehicles += new Vehicle(10,"ciaz","Maruti",2015,"Diesel","Manual");
    vehicles += new Vehicle(11,"alto 800","Maruti",2017,"Petrol","Manual");
    vehicles += new Vehicle(12,"ciaz","Maruti",2015,"Diesel","Manual");
    vehicles += new Vehicle(13,"ciaz","Maruti",2015,"Petrol","Automatic");
    vehicles += new Vehicle(14,"ertiga","Maruti",2015,"Petrol","Manual");
    vehicles += new Vehicle(15,"dzire","Maruti",2009,"Petrol","Manual");
    vehicles += new Vehicle(16,"ertiga","Maruti",2016,"Diesel","Manual");
    vehicles += new Vehicle(17,"ertiga","Maruti",2015,"Diesel","Manual");
    vehicles += new Vehicle(18,"ertiga","Maruti",2016,"Diesel","Manual");
    vehicles += new Vehicle(19,"wagon r","Maruti",2015,"CNG","Manual");
    vehicles += new Vehicle(20,"sx4","Maruti",2010,"Petrol","Manual");
    vehicles += new Vehicle(21,"alto k10","Maruti",2016,"Petrol","Manual");
    vehicles += new Vehicle(22,"ignis","Maruti",2017,"Petrol","Manual");
    vehicles += new Vehicle(23,"sx4","Maruti",2011,"Petrol","Automatic");
    vehicles += new Vehicle(24,"alto k10","Maruti",2014,"Petrol","Manual");
    vehicles += new Vehicle(25,"wagon r","Maruti",2013,"Petrol","Manual");
    vehicles += new Vehicle(26,"swift","Maruti",2011,"Petrol","Manual");
    vehicles += new Vehicle(27,"swift","Maruti",2013,"Petrol","Manual");
    vehicles += new Vehicle(28,"swift","Maruti",2017,"Petrol","Manual");
    vehicles += new Vehicle(29,"alto k10","Maruti",2010,"Petrol","Manual");
    vehicles += new Vehicle(30,"ciaz","Maruti",2015,"Diesel","Manual");
    vehicles += new Vehicle(31,"ritz","Maruti",2012,"Diesel","Manual");
    vehicles += new Vehicle(32,"ritz","Maruti",2011,"Petrol","Manual");
    vehicles += new Vehicle(33,"swift","Maruti",2014,"Diesel","Manual");
    vehicles += new Vehicle(34,"ertiga","Maruti",2014,"Diesel","Manual");
    vehicles += new Vehicle(35,"dzire","Maruti",2014,"Diesel","Manual");
    vehicles += new Vehicle(36,"sx4","Maruti",2011,"CNG","Manual");
    vehicles += new Vehicle(37,"dzire","Maruti",2015,"Petrol","Manual");
    vehicles += new Vehicle(38,"800","Maruti",2003,"Petrol","Manual");
    vehicles += new Vehicle(39,"alto k10","Maruti",2016,"Petrol","Manual");
    vehicles += new Vehicle(40,"sx4","Maruti",2003,"Petrol","Manual");
    vehicles += new Vehicle(41,"baleno","Maruti",2016,"Petrol","Automatic");
    vehicles += new Vehicle(42,"alto k10","Maruti",2014,"Petrol","Manual");
    vehicles += new Vehicle(43,"sx4","Maruti",2008,"Petrol","Manual");
    vehicles += new Vehicle(44,"dzire","Maruti",2014,"Diesel","Manual");
    vehicles += new Vehicle(45,"omni","Maruti",2012,"Petrol","Manual");
    vehicles += new Vehicle(46,"ciaz","Maruti",2014,"Petrol","Automatic");
    vehicles += new Vehicle(47,"ritz","Maruti",2013,"Petrol","Manual");
    vehicles += new Vehicle(48,"wagon r","Maruti",2006,"Petrol","Manual");
    vehicles += new Vehicle(49,"ertiga","Maruti",2015,"Petrol","Manual");
    vehicles += new Vehicle(50,"ciaz","Maruti",2017,"Petrol","Automatic");
    vehicles += new Vehicle(51,"fortuner","Toyota",2012,"Diesel","Automatic");
    vehicles += new Vehicle(52,"fortuner","Toyota",2015,"Diesel","Automatic");
    vehicles += new Vehicle(53,"innova","Toyota",2017,"Diesel","Automatic");
    vehicles += new Vehicle(54,"fortuner","Toyota",2013,"Diesel","Automatic");
    vehicles += new Vehicle(55,"innova","Toyota",2005,"Petrol","Manual");
    vehicles += new Vehicle(56,"corolla altis","Toyota",2009,"Petrol","Automatic");
    vehicles += new Vehicle(57,"etios cross","Toyota",2015,"Petrol","Manual");
    vehicles += new Vehicle(58,"corolla altis","Toyota",2010,"Petrol","Manual");
    vehicles += new Vehicle(59,"etios g","Toyota",2014,"Petrol","Manual");
    vehicles += new Vehicle(60,"fortuner","Toyota",2014,"Diesel","Automatic");
    vehicles += new Vehicle(61,"corolla altis","Toyota",2013,"Petrol","Manual");
    vehicles += new Vehicle(62,"etios cross","Toyota",2015,"Petrol","Manual");
    vehicles += new Vehicle(63,"fortuner","Toyota",2014,"Diesel","Automatic");
    vehicles += new Vehicle(64,"fortuner","Toyota",2015,"Diesel","Automatic");
    vehicles += new Vehicle(65,"fortuner","Toyota",2017,"Diesel","Automatic");
    vehicles += new Vehicle(66,"etios liva","Toyota",2014,"Diesel","Manual");
    vehicles += new Vehicle(67,"innova","Toyota",2017,"Petrol","Automatic");
    vehicles += new Vehicle(68,"fortuner","Toyota",2010,"Diesel","Manual");
    vehicles += new Vehicle(69,"corolla altis","Toyota",2011,"Petrol","Manual");
    vehicles += new Vehicle(70,"corolla altis","Toyota",2016,"Petrol","Manual");
    vehicles += new Vehicle(71,"etios liva","Toyota",2014,"Diesel","Manual");
    vehicles += new Vehicle(72,"corolla altis","Toyota",2011,"Diesel","Manual");
    vehicles += new Vehicle(73,"corolla altis","Toyota",2013,"Petrol","Manual");
    vehicles += new Vehicle(74,"etios liva","Toyota",2011,"Petrol","Manual");
    vehicles += new Vehicle(75,"etios cross","Toyota",2014,"Diesel","Manual");
    vehicles += new Vehicle(76,"etios g","Toyota",2015,"Petrol","Manual");
    vehicles += new Vehicle(77,"corolla altis","Toyota",2013,"Petrol","Manual");
    vehicles += new Vehicle(78,"corolla","Toyota",2004,"Petrol","Automatic");
    vehicles += new Vehicle(79,"corolla altis","Toyota",2010,"Petrol","Automatic");
    vehicles += new Vehicle(80,"fortuner","Toyota",2012,"Diesel","Automatic");
    vehicles += new Vehicle(81,"corolla altis","Toyota",2016,"Diesel","Manual");
    vehicles += new Vehicle(82,"etios gd","Toyota",2015,"Diesel","Manual");
    vehicles += new Vehicle(83,"innova","Toyota",2017,"Diesel","Automatic");
    vehicles += new Vehicle(84,"innova","Toyota",2015,"Diesel","Manual");
    vehicles += new Vehicle(85,"innova","Toyota",2005,"Diesel","Manual");
    vehicles += new Vehicle(86,"camry","Toyota",2006,"Petrol","Automatic");
    vehicles += new Vehicle(87,"land cruiser","Toyota",2010,"Diesel","Manual");
    vehicles += new Vehicle(88,"corolla altis","Toyota",2012,"Petrol","Manual");
    vehicles += new Vehicle(89,"etios liva","Toyota",2013,"Petrol","Manual");
    vehicles += new Vehicle(90,"etios g","Toyota",2014,"Petrol","Manual");
    vehicles += new Vehicle(91,"corolla altis","Toyota",2009,"Petrol","Manual");
    vehicles += new Vehicle(92,"innova","Toyota",2014,"Diesel","Manual");
    vehicles += new Vehicle(93,"innova","Toyota",2005,"Petrol","Manual");
    vehicles += new Vehicle(94,"fortuner","Toyota",2015,"Diesel","Automatic");
    vehicles += new Vehicle(95,"corolla altis","Toyota",2008,"Petrol","Automatic");
    vehicles += new Vehicle(96,"corolla altis","Toyota",2012,"Petrol","Manual");
    vehicles += new Vehicle(97,"innova","Toyota",2016,"Diesel","Automatic");
    vehicles += new Vehicle(98,"corolla altis","Toyota",2017,"Petrol","Manual");
    vehicles += new Vehicle(99,"corolla altis","Toyota",2013,"Petrol","Manual");
    vehicles += new Vehicle(100,"fortuner","Toyota",2010,"Diesel","Manual");

    return vehicles.toList
  }
}

