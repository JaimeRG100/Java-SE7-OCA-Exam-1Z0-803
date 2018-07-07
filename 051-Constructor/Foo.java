class Foo{
  int size;
  String name;
  
  // constructors are used to initialize instance variable state
  Foo(String name, int size) {
    this.name = name;
    this.size = size;
  }
  
  public static void main(String[] args) {
    // Won't compile, no matching constructor
    // Foo f = new Foo();
    
    // No problem. Arguments match the Foo constructor.
    Foo f = new Foo("Fred", 43);
    
  }

}

class Boo{
  Boo() {} // The constructor for the Foo class

}