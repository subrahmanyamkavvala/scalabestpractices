package practice

/*In scala, trait mixins means you can extend any number of traits with a class or abstract class. 
 * You can extend only traits or combination of traits and class or traits and abstract class.

It is necessary to maintain order of mixins otherwise compiler throws an error.
*/
object MixinsEx {
  def main(args: Array[String]) {
    val d = new D
    d.message // I'm an instance of class B
    print(d.loudMessage) // I'M AN INSTANCE OF CLASS B
  }
}
abstract class A {
  val message: String
}
class B extends A {
  val message = "I'm an instance of class B"
}
trait C extends A {
  def loudMessage = message.toUpperCase()
}
class D extends B with C