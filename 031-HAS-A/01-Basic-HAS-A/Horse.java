public class Horse extends Animal {
  private Halter myHalter;
  
  // A Horse IS-A Animal. 
  // A Horse HAS-A Halter.
  
  
  //test code
  public static void main(String[] args) {
    Horse h = new Horse();
    Animal a = new Animal();
    
    Horse h__ = new Horse();
    Animal a__ = new Animal();
    a__ = h__;
 // h__ = a__;    Error: incompatible types: Animal cannot be converted to Horse
    
    
    Animal A = new Horse();
 // Horse H = new Animal();    Error: incompatible types: Animal cannot be converted to Horse
    
  }
}

class Halter {
}