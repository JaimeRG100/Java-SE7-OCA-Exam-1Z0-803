class DogTest {
  public static void main(String [] args) {
    Animal animal = new Animal();
    Dog d = (Dog) animal; // compiles but fails later
    //java.lang.ClassCastException: Animal cannot be cast to Dog
  }
}

class Animal { }
class Dog extends Animal { }