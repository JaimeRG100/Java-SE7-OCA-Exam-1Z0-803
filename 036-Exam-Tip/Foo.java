import java.io.*;

public class Foo {
  public void doStuff(int y, String s) { }
  public void moreThings(int x) { }    
}

class Bar extends Foo {
  // Overloaded method
  public void doStuff(int y, long s) throws IOException { }
}