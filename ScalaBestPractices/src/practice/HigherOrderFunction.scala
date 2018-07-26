package practice
object HigherOrderFunction extends App {

  functionExample(25, multiplyBy2)
 
  def functionExample(a: Int, f: Int => AnyVal): Unit = {
    println(f(a)) // Calling that function
  }
  def multiplyBy2(a: Int): Int = {
    a * 2
  }

}
