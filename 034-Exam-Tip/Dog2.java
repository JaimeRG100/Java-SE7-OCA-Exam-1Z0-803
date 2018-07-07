class Dog2 extends Animal {
  public void eat() { /* no Exceptions */  }

  public static void main(String[] args) {
    Animal a = new Dog2();
    Dog2 d = new Dog2();
    d.eat();   // ok
    a.eat();   // compile error: unreported exception
  }
}