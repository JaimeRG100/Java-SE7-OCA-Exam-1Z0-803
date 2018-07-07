class DogTest {
  public static void main(String [] args) {
    Animal a = new Dog();
    a.doStuff();      //"Dog doStuff"
    Dog d = (Dog) a;
    d.doStuff();      //"Dog doStuff"
  }
}

class Animal { 
  void doStuff() {
    System.out.println("Animal doStuff");
  }
}

class Dog extends Animal { 
  void doStuff() {
    System.out.println("Dog doStuff");
  }
}
