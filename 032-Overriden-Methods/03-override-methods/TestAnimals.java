public class TestAnimals {
  public static void main(String[] args) {
    Animal a = new Animal();
    Animal b = new Horse();   // Animal ref, but a Horse object
    a.eat();                  // Run the Animal version of eat()
    b.eat();                  // Run the Horse  version of eat()
    
  }
  
}


class Animal {
  public void eat() {
    System.out.println("Generic Animal Eating Generically");
  }
}

class Horse extends Animal {
  private void eat() {          // WHOA! - IT'S PRIVATE !
    System.out.println("Horse eating hay, oats " 
                      + "and horse treats");
  }

}