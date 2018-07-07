class Moo2 extends Zoo {
  public void useMyCoolMethod() {
    //This code works, because Moo can inherit the public method
    System.out.println("Moo says, " + this.coolMethod());
    //This code works, because Moo can instantiate the public method
    Zoo z = new Zoo();
    System.out.println("Zoo says, " + z.coolMethod());
  }
  
  //test code
  public static void main(String[] args) {
    Moo2 m = new Moo2();     
    m.useMyCoolMethod();    
  }  
  
}