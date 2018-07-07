public class TestAnimals {
  public static void main(String[] args) {
    Animal a = new Animal();
    Animal b = new Horse();   // Animal ref, but a Horse object
    a.eat();  // Run the Animal version of eat()
    b.eat();  // Run the Horse  version of eat()
    
    // example of reference methods
    Animal c = new Horse();
    //c.buck();   //Cant't invoke buck();
                // Animal class doesn't have that method
  }
  
}


class Animal {
  public void eat() {
    System.out.println("Generic Animal Eating Generically");
  }
}

class Horse extends Animal {
  public void eat() {
    System.out.println("Horse eating hay, oats " 
                      + "and horse treats");
  }
  
  public void buck() {}

}