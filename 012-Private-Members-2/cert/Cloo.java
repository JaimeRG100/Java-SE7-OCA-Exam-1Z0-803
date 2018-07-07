package cert;

class Cloo extends Roo {                 // Cloo and Roo are in the same package
  public void testCloo() {               // Still ok, superclass Roo is public
    //System.out.println(doRooThings()); // Compiler Error: cannot find symbol
  }
  
  public void doRooThings() {
    System.out.println("doRooThings() method (not inherited)");    
  }
  
  //test code
  public static void main(String[] args) {
    Cloo c = new Cloo();
    c.doRooThings();
  }
  
  
}