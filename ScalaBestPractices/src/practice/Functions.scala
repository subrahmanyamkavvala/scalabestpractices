package practice


//creating the functions 
//def functionName ([list of parameters]) : [return type]
object Functions {
  
  def sum (a : Int ,b : Int ) : Int ={
    return a+b;
  } 
  
  def main (args : Array[String]){
    
    println("sun : "  + sum(10,30));
    
   //call by name 
    delayed(time());
    delayed(1234567890);
   // time();
    
     printStrings("hello","scala","python");
     printStrings("hello");
    
  }
  
  
  //call by Name : 
  
   def time() = {
      println("Getting time in nano seconds")
      System.nanoTime
   }
   def delayed( t: => Long ) = {
      println("In delayed method")
      println("Param: " + t)
   }
   
   
   //functions with arguments 
   
    def printStrings( args:String ) = {
      var i : Int = 0;
      
      for( arg <- args ){
         println("Arg value[" + i + "] = " + arg );
         i = i + 1;
      }
   }
   def printStrings( args:String* ) = {
      var i : Int = 0;
      
      for( arg <- args ){
         println("Arg value[" + i + "] = " + arg );
         i = i + 1;
      }
   }
}