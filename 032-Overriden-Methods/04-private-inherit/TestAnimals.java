public class TestAnimals {
  public static void main(String[] args) {
    Horse h = new Horse();
    h.eat();   // Not legal beacuse Horse didn't inherit eat()

  }
  
}


class Animal {
  private void eat() {
    System.out.println("Generic Animal Eating Generically");
  }

}

class Horse extends Animal { }
