public class Animal {
  public void eat() {
    System.out.println("Generic Animal Eating Generically");    
  }
  
  public static void main(String[] args) {
    (new Animal()).eat();
    (new Horse()).eat();
  }
}

class Horse extends Animal {
  public void eat() {
    System.out.println("Horse eating hay, oats, "
                         + "and horse treats");    
  }
}
