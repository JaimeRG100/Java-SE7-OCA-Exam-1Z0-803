public class Foo{
  void go() { }
}
/*public*/ class Bar extends Foo {
  String go() { // Not legal! Can't change only the return type
    return null;
  }
}