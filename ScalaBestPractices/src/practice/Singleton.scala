package practice

//singleton and conpanion object 
//same object and class type -> the class can access the private valuse
//can access using object name directly -> static variables like in java


object Singleton{
  private var name:String = " subbu ";
  
  def showCompaniot(){
    var  obj:Singleton = new Singleton
    
    println("companion value : "+obj.classVar)
  }
  
}
class Singleton {
 import Singleton._
  
  private var classVar : Int =12
  def show(){
   println( "name : "+Singleton.name)
  }
  
}

object main {
  
  
  def main(args : Array[String]){
    
    var o:Singleton = new Singleton
    o.show()
    Singleton.showCompaniot()
    
    
  }
}