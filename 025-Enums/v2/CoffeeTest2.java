class Coffee2 {
  enum CoffeeSize { BIG, HUGE, OVERWHELMING }  //this is an instance variable
  CoffeeSize size;                             //this is an instance variable
}
  
public class CoffeeTest2 {  
  
  public static void main(String[] args){
    
    Coffee2 drink = new Coffee2();
    drink.size = Coffee2.CoffeeSize.BIG;        // enclosing class name required
    
    //test code
    System.out.println(drink.size);
    
  }
  
}