package somethingElse;
import certification.OtherClass2;

public class AccessClass2 extends OtherClass2 {
  
  public static void main(String[] args){
    AccessClass2 o = new AccessClass2();
    // This code doesn't generate an Error, because
    // protected method can be inherited
    o.testIt();
  }
  
  
  //test code, protected method can also be overriden
  
  protected void testIt() {
   super.testIt();
   System.out.println("bye");
  }
  

}