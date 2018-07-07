public class TestAdder {
  public static void main(String[] args)  {
    Adder a = new Adder();
    int b = 27;
    int c = 3;
    int result = a.addThem(b, c);                // Which addThem is invoked?
    double doubleResult = a.addThem(22.5, 9.3);  // Which addThem?
    System.out.println(result);
    System.out.println(doubleResult);
  }
  
}
