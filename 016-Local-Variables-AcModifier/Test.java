public class Test {
  
  void doStuff() {
    final int a = 10; // This is allowed
    
    private int x;    // Error: illegal start of expression
    public int y;     // Error: illegal start of expression
    protected int z;  // Error: illegal start of expression
  }
}