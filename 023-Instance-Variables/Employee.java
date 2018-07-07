public class Employee {
  // define fields (instance variables) for employee instances
  private String name = "";
  private String title ="Tittle 1";
  private String manager;
  
  //other code goes here including access for private fields
  
  
  //test code
  public static void main(String... args){
    Employee e = new Employee();
    System.out.println(e.title);
  }
  
}

class Test {
  public static void main(String... args){
    System.out.println("This code doesn't run automatically");
  }
}