package neighbor;
import other.Child;
import certification.Parent;

public class Child3 {
  
  public void testTwo() {
    
  }
  
    public static void main(String[] args) {
    Child c = new Child();
    //c.x = c.x + 5;            //x has protected access in certification.Parent
    //System.out.println(c.x);  //x has protected access in certification.Parent
    
    Parent p = new Parent();
    //System.out.println(p.x);  // Error: x has protected access in certification.Parent
  }
  
}