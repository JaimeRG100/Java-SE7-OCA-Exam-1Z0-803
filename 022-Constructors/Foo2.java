class Foo2 {
  
  // legal constructors
  Foo2() {}
  
  private Foo2(byte b) {}
  Foo2(int x) {}
  
  Foo2(int x, int... y) {}
  
  /* illegal constructor
  
  
  */
  
  void Foo2() { }            // it's a method not a constructor
  //Foo() {}                 // not a method or constructor      < Error: invalid method declaration; return type required
  //Foo2(short s);           // looks like an abstract method    < Error: missing method body, or declare abstract
  //static Foo2(long x) {}   // can't be static                  < Error: modifier static not allowed here
  //final Foo2(long x) {}    // can't be final                   < Error: modifier final not allowed here
  //abstract Foo2(char c) {} // can't be abstract                < Error: modifier abstract not allowed here
  //Foo2(int... x, int t) {} // bad var-arg syntax               < Error: ')' expected
  

  
}