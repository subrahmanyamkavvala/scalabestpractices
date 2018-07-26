package practice

object CompanionEx {
  private var x =10;
   def main(args : Array[String]){
     var cam=new CompanionEx()
     cam.show(100)
   }
}

class CompanionEx {
  def show(a:Int){
    printf("show "+(a+CompanionEx.x))
  }
}