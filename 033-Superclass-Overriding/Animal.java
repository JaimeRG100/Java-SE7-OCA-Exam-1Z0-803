public class Animal {
  public void eat() { }
  public void printYourself() {
    // Useful printing code goes here
    System.out.println("printYourself (Aninal) method");
  }
  
  // test code
  public static void main(String[] args) {
    (new Horse()).printYourself();
  }
}

class Horse extends Animal {
  public void printYourself() {
    // Take advantage of Animal code, then add some more
    super.printYourself();  // Invoke the superclass
                            // (Animal) code
                            // Then do Horse-specific
                            // print work here
    System.out.println("printYourself (Horse) method");
  }
}