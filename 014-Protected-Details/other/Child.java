package other;
 
import certification.Parent;            // Different package

public class Child extends Parent {
  
  public void testIt(){
    // test1.- passed
    System.out.println("x is " + x);    // No problem, Child inherits x
    
    //test2.- denied
    Parent p = new Parent();
    //Error: x has protected access in certification.Parent
    //System.out.println("X in parent is " + p.x);
  }
  
  //test code
  public static void main(String[] args) {
    //Child c = new Child();
    //c.testIt();
  }
  
}