package practice

object AnonymousFunctionn {

  def main(a: Array[String]) {

    var x = () => 10 + 20

    println(x.apply()) //calling anonymous function

    println(x())

    var y = (a: Int, b: Int) => a + b

    println(y(100, 200))
  }

}