package nocert;
import cert.Roo;

public class UseARoo {
  public void testIt() {
    Roo r = new Roo(); // So far so good, class Roo is public
    System.out.println(r.doRooThings()); // Compile Error:  doRooThings() has private access in cert.Roo
  }
  
}