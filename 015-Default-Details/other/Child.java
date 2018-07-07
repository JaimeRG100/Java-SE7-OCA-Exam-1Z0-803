package other;

import certification.Parent;

public class Child extends Parent{
  public void testIt() {
    System.out.println("x is " + x);  //Error: x is not public in certification.Parent;
  }
  
}
