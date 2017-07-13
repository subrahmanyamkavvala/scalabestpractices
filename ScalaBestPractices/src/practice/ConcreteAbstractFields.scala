package practice


trait one {
  var a:Int // abstract variale
  var b:Int = 30 //concrete var
  
  def oneshow()
}

trait two {
  
  
  def twoshow()
  
}

trait three {
  
  def threeshow()
}


class ConcreteAbstractFields extends one with two {
   
  var a = 100;
  def oneshow(){
   println("one show") 
  }
  
  def twoshow(){
    println("two show")
    
  }
  
  def threeshow(){
    println("three shoe")
  }
  
}

object concretemain{
  def main(args : Array[String]){
    
    var obj : ConcreteAbstractFields = new ConcreteAbstractFields
    obj.oneshow()
    obj.twoshow()
    obj.threeshow()
  }
}