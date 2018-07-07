class Returns {
  
  // You can return null
  public Button doStuff() {
    return null;
  }
  
  // You can return array
  public String[] go() {
    return new String[] {"Fred", "Barney", "Wilma"};
  }
  
  // You can return variables that can be implicitly values
  public int foo() {
    char c = 'c';
    return c;
  }
  
  // You can return any value that can be explicitly cast
  public int foo2() {
    float f = 32.5f;
    return (int) f;
  }
  
  //Not legal
  public void var() {
    //return "this is it"; 
  }
  
  // In void methods you can say return;
  public void var2() {
    return;
  }
  
  // You can return any object that can be implicitly cast
  public Animal getAnimal() {
    return new Horse(); 
  }
  
  public Object getObject() {
    int[] nums = {1, 2, 3};
    return nums;
  }
  
  // You can return an interface implementer
  public Chewable getChewable() {
    return new Gum();   
  }  
}

// --------------------
class Button { }
// --------------------
class Animal { }
class Horse extends Animal { }
// --------------------
/*public*/ interface Chewable { }
/*public*/ class Gum implements Chewable { 
  public void sayHello() {
    System.out.println("Hello from Gum class");
  }
}
// public modifiers commented to avoid generate another file

