package practice

object ConstructorsEx {
  def main(args: Array[String]) {
    var d = new Student(1247, "subbu")
    d.showDetails()

    d = new Student(1247, "subbu",77)
    d.showDetails()

  }
}

class Student(id: Int, name: String) {
  var age: Int = 0
  def showDetails() {
    println(id + " " + name);
  }
  def this(id: Int, name: String, age: Int) {
    this(id, name) // Calling primary constructor, and it is first line
    this.age = age
  }
}  