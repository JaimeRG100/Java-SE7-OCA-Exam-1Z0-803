package somethingElse;
import certification.OtherClass;

public class AccessClass {
  
  public static void main(String[] args){
    OtherClass o = new OtherClass();
    o.testIt();
    //Compiler Error: testIt() is not public in certification.
    //OtherClass; cannot be accessed from outside package

  }
  

}