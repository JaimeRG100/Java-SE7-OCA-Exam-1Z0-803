class UseAnimals {
  public void doStuff(Animal a) {
    System.out.println("In the Animal version");
  }
  
  public void doStuff(Horse h) {
    System.out.println("In the Horse version");
  }
  
  public static void main (String [] args) {
    UseAnimals ua = new UseAnimals();
    Animal animalObj = new Animal();
    Horse horseObj = new Horse();
    ua.doStuff(animalObj);        //In the Animal version
    ua.doStuff(horseObj);         //In the Horse version
    
    // using Animal reference to a Horse object
    Animal animalRefToHorse = new Horse();
    ua.doStuff(animalRefToHorse); //In the Animal version !!!
    
    // the reference type (not the object type) determines 
    // which overloaded method is invoked!
  }
}