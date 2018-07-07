public class Mini extends Car {
  public void goUpHill() {
    // Mini-specific going uphill code
  }
  
  // Test code
  public static void main(String... args) {
    Mini m = new Mini();
    System.out.println(m.getType());
  }
}