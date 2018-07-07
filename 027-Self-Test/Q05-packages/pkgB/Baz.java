package pkgB;

import pkgA.*;

public class Baz {
  
  public static void main(String[] args) {
    Foo f = new Foo();
    System.out.print(" " + f.a);    // Error: a is not public 
    System.out.print(" " + f.b);   // Error: b has protected access in pkgA.Foo
    System.out.println(" " + f.c);
  }
}