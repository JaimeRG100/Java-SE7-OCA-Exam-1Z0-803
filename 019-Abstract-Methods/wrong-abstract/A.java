public abstract class A {
  abstract void foo();
}

class B extends A {
  void foo(int I) {}   // Error: B is not abstract and does not override abstract method foo() in A
  
  // void foo(int I) {}   <- this code should be written, so the code can be compiled
}
