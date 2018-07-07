public class Foo{
  void go() { }
}

/*public */ class Bar extends Foo {  // commented code, to no generate two files
  String go(int x) {  // overloaded method
    return null;
  }
}