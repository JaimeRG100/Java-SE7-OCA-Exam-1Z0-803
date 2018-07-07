class Moo {
  public void useAZoo() {
    Zoo z = new Zoo();
    // This code demostrates that Moo can access to Zoo public method
    System.out.println("A Zoo says, " + z.coolMethod());
  }
  
  //test code
  public static void main(String[] args) {
    Moo m = new Moo(); 
    m.useAZoo();
  }
}