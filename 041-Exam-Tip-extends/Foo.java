public class Foo {
  void doStuff() { }
}


class Bar extends Foo {
  // overloaded method not overridden by a subclass
  void doStuff(String s) { }
}


//Foo can invoke only the no-arg version
//Bar can invoke either of the overloaded versions.