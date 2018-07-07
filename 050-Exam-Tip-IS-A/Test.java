public class Test {
  public Animal go() {
    return new Bear();  // OK, Bear "is-a" Animal
  }
  
  //test code
  public static void main(String[] args) {
    (new Bear()).walk();    
    //(new Animal()).walk();
  }
}

/*public*/ abstract class Animal { }

/*public*/ class Bear extends Animal { 
  public void walk(){
    System.out.println("Walking");
  }

}