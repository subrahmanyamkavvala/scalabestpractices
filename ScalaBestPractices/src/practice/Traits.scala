package practice

trait Animal {
  var name:String = ""
  
  def display()
}


class Dog extends Animal{
  
  def display{
    println("i am dog ")
  }
  
}

class Cat extends Animal{
  
  def display{
    println("i am cat ")
  }
  
}

object mymain {
  
  def main(args : Array[String]){
  var cat:Animal = new Cat
  cat.display()
  
  var dog: Animal = new Dog
  dog.display()
  }
}