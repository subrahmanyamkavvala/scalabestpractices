package practice

trait A {
  def show() {
    println("I am A")
  }
}

trait B extends A {

  override def show() {
    println("I am B")

  }

}

trait C extends A {
  override def show() {
    println("I am C")

  }
}
class DiamondProblem extends C with B { // the last mentioned C show method will get call
  override def show() {
    println("I am in Class")
  }
}
object diamond {
  def main(ags: Array[String]) {

    var diamond: DiamondProblem = new DiamondProblem
    diamond.show()

  /*  var a: A = new DiamondProblem
    a.show()

    var c: C = new DiamondProblem
    c.show()*/

  }
}