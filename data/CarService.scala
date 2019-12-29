package functional


import scala.collection.mutable.ListBuffer

object CarService {

  def getAllCars():List[Car] ={
    var cars = new ListBuffer[Car]()
    cars += new Car(1,"Volvo XC40  ","Volvo",2017,"Diesel","Automatic");
    cars += new Car(2,"Volvo XC60  ","Volvo",2017,"Diesel","Automatic");
    cars += new Car(3,"Volvo V90 Cross Country  ","Volvo",2016,"Diesel","Automatic");
    cars += new Car(4,"Volvo S60 Polestar  ","Volvo",2010,"Diesel","Automatic");
    cars += new Car(5,"Volvo S90  ","Volvo",2016,"Diesel","Automatic");
    cars += new Car(6,"Volvo XC90 Excellence  ","Volvo",2015,"Diesel","Automatic");
    cars += new Car(7,"Volvo XC90 Excellence Lounge  ","Volvo",2015,"Diesel","Automatic");
    cars += new Car(8,"Volvo XC90   ","Volvo",2015,"Diesel","Automatic");
    cars += new Car(9,"Volvo S60","Volvo",2010,"Diesel","Automatic");
    cars += new Car(10,"ciaz","Maruti",2015,"Diesel","Manual");
    cars += new Car(11,"alto 800","Maruti",2017,"Petrol","Manual");
    cars += new Car(12,"ciaz","Maruti",2015,"Diesel","Manual");
    cars += new Car(13,"ciaz","Maruti",2015,"Petrol","Automatic");
    cars += new Car(14,"ertiga","Maruti",2015,"Petrol","Manual");
    cars += new Car(15,"dzire","Maruti",2009,"Petrol","Manual");
    cars += new Car(16,"ertiga","Maruti",2016,"Diesel","Manual");
    cars += new Car(17,"ertiga","Maruti",2015,"Diesel","Manual");
    cars += new Car(18,"ertiga","Maruti",2016,"Diesel","Manual");
    cars += new Car(19,"wagon r","Maruti",2015,"CNG","Manual");
    cars += new Car(20,"sx4","Maruti",2010,"Petrol","Manual");
    cars += new Car(21,"alto k10","Maruti",2016,"Petrol","Manual");
    cars += new Car(22,"ignis","Maruti",2017,"Petrol","Manual");
    cars += new Car(23,"sx4","Maruti",2011,"Petrol","Automatic");
    cars += new Car(24,"alto k10","Maruti",2014,"Petrol","Manual");
    cars += new Car(25,"wagon r","Maruti",2013,"Petrol","Manual");
    cars += new Car(26,"swift","Maruti",2011,"Petrol","Manual");
    cars += new Car(27,"swift","Maruti",2013,"Petrol","Manual");
    cars += new Car(28,"swift","Maruti",2017,"Petrol","Manual");
    cars += new Car(29,"alto k10","Maruti",2010,"Petrol","Manual");
    cars += new Car(30,"ciaz","Maruti",2015,"Diesel","Manual");
    cars += new Car(31,"ritz","Maruti",2012,"Diesel","Manual");
    cars += new Car(32,"ritz","Maruti",2011,"Petrol","Manual");
    cars += new Car(33,"swift","Maruti",2014,"Diesel","Manual");
    cars += new Car(34,"ertiga","Maruti",2014,"Diesel","Manual");
    cars += new Car(35,"dzire","Maruti",2014,"Diesel","Manual");
    cars += new Car(36,"sx4","Maruti",2011,"CNG","Manual");
    cars += new Car(37,"dzire","Maruti",2015,"Petrol","Manual");
    cars += new Car(38,"800","Maruti",2003,"Petrol","Manual");
    cars += new Car(39,"alto k10","Maruti",2016,"Petrol","Manual");
    cars += new Car(40,"sx4","Maruti",2003,"Petrol","Manual");
    cars += new Car(41,"baleno","Maruti",2016,"Petrol","Automatic");
    cars += new Car(42,"alto k10","Maruti",2014,"Petrol","Manual");
    cars += new Car(43,"sx4","Maruti",2008,"Petrol","Manual");
    cars += new Car(44,"dzire","Maruti",2014,"Diesel","Manual");
    cars += new Car(45,"omni","Maruti",2012,"Petrol","Manual");
    cars += new Car(46,"ciaz","Maruti",2014,"Petrol","Automatic");
    cars += new Car(47,"ritz","Maruti",2013,"Petrol","Manual");
    cars += new Car(48,"wagon r","Maruti",2006,"Petrol","Manual");
    cars += new Car(49,"ertiga","Maruti",2015,"Petrol","Manual");
    cars += new Car(50,"ciaz","Maruti",2017,"Petrol","Automatic");
    cars += new Car(51,"fortuner","Toyota",2012,"Diesel","Automatic");
    cars += new Car(52,"fortuner","Toyota",2015,"Diesel","Automatic");
    cars += new Car(53,"innova","Toyota",2017,"Diesel","Automatic");
    cars += new Car(54,"fortuner","Toyota",2013,"Diesel","Automatic");
    cars += new Car(55,"innova","Toyota",2005,"Petrol","Manual");
    cars += new Car(56,"corolla altis","Toyota",2009,"Petrol","Automatic");
    cars += new Car(57,"etios cross","Toyota",2015,"Petrol","Manual");
    cars += new Car(58,"corolla altis","Toyota",2010,"Petrol","Manual");
    cars += new Car(59,"etios g","Toyota",2014,"Petrol","Manual");
    cars += new Car(60,"fortuner","Toyota",2014,"Diesel","Automatic");
    cars += new Car(61,"corolla altis","Toyota",2013,"Petrol","Manual");
    cars += new Car(62,"etios cross","Toyota",2015,"Petrol","Manual");
    cars += new Car(63,"fortuner","Toyota",2014,"Diesel","Automatic");
    cars += new Car(64,"fortuner","Toyota",2015,"Diesel","Automatic");
    cars += new Car(65,"fortuner","Toyota",2017,"Diesel","Automatic");
    cars += new Car(66,"etios liva","Toyota",2014,"Diesel","Manual");
    cars += new Car(67,"innova","Toyota",2017,"Petrol","Automatic");
    cars += new Car(68,"fortuner","Toyota",2010,"Diesel","Manual");
    cars += new Car(69,"corolla altis","Toyota",2011,"Petrol","Manual");
    cars += new Car(70,"corolla altis","Toyota",2016,"Petrol","Manual");
    cars += new Car(71,"etios liva","Toyota",2014,"Diesel","Manual");
    cars += new Car(72,"corolla altis","Toyota",2011,"Diesel","Manual");
    cars += new Car(73,"corolla altis","Toyota",2013,"Petrol","Manual");
    cars += new Car(74,"etios liva","Toyota",2011,"Petrol","Manual");
    cars += new Car(75,"etios cross","Toyota",2014,"Diesel","Manual");
    cars += new Car(76,"etios g","Toyota",2015,"Petrol","Manual");
    cars += new Car(77,"corolla altis","Toyota",2013,"Petrol","Manual");
    cars += new Car(78,"corolla","Toyota",2004,"Petrol","Automatic");
    cars += new Car(79,"corolla altis","Toyota",2010,"Petrol","Automatic");
    cars += new Car(80,"fortuner","Toyota",2012,"Diesel","Automatic");
    cars += new Car(81,"corolla altis","Toyota",2016,"Diesel","Manual");
    cars += new Car(82,"etios gd","Toyota",2015,"Diesel","Manual");
    cars += new Car(83,"innova","Toyota",2017,"Diesel","Automatic");
    cars += new Car(84,"innova","Toyota",2015,"Diesel","Manual");
    cars += new Car(85,"innova","Toyota",2005,"Diesel","Manual");
    cars += new Car(86,"camry","Toyota",2006,"Petrol","Automatic");
    cars += new Car(87,"land cruiser","Toyota",2010,"Diesel","Manual");
    cars += new Car(88,"corolla altis","Toyota",2012,"Petrol","Manual");
    cars += new Car(89,"etios liva","Toyota",2013,"Petrol","Manual");
    cars += new Car(90,"etios g","Toyota",2014,"Petrol","Manual");
    cars += new Car(91,"corolla altis","Toyota",2009,"Petrol","Manual");
    cars += new Car(92,"innova","Toyota",2014,"Diesel","Manual");
    cars += new Car(93,"innova","Toyota",2005,"Petrol","Manual");
    cars += new Car(94,"fortuner","Toyota",2015,"Diesel","Automatic");
    cars += new Car(95,"corolla altis","Toyota",2008,"Petrol","Automatic");
    cars += new Car(96,"corolla altis","Toyota",2012,"Petrol","Manual");
    cars += new Car(97,"innova","Toyota",2016,"Diesel","Automatic");
    cars += new Car(98,"corolla altis","Toyota",2017,"Petrol","Manual");
    cars += new Car(99,"corolla altis","Toyota",2013,"Petrol","Manual");
    cars += new Car(100,"fortuner","Toyota",2010,"Diesel","Manual");

    return cars.toList
  }
}

