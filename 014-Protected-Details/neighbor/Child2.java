package neighbor;
import other.Child;

public class Child2 extends Child {
  
  public void testTwo() {
    super.x = super.x  + 5;
    System.out.println(super.x);
    x++;
    System.out.println(x);
  }
  
    public static void main(String[] args) {
    Child2 c = new Child2();
    c.testTwo();
  }
  
}