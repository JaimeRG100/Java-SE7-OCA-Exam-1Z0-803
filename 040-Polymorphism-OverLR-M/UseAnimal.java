public class UseAnimal {
  Animal a = new Animal();
  
  public static void main(String[] args) {
    //Generic Animal Eating Generically
    Animal a = new Animal();
    a.eat();
    
    //Horse eating hay
    Horse h = new Horse();
    h.eat();
    
    //Horse eating hay
    Animal ah  = new Horse();
    ah.eat();
    
    //Horse eating Apples
    Horse he = new Horse();
    he.eat("Apples");
    
    //Compiler error!
    Animal a2 = new Animal();
    //a2.eats("treats");
    
    //Compiler error!
    Animal ah2 = new Horse();
    ah2.eat("Carrtos");
    //Animal object reference doesn't have that method reference
    
    
    
    
  }
}