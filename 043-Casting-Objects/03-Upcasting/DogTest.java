class DogTest {
  public static void main(String [] args) {
    Dog d = new Dog();
    Animal a1 = d;          // upcast ok with no explicit cast
    Animal a2 = (Animal) d; // upcast ok with an explicit cast
  }
}

class Animal { 
}

class Dog extends Animal { }
