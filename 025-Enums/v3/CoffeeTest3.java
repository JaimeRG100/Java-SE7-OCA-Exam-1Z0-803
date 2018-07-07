class Coffee {    
  CoffeeSize size;
}
  
public class CoffeeTest3 {  
  
  public static void main(String[] args){
    
    enum CoffeeSize { BIG, HUGE, OVERWHELMING };   //WRING! cannot declare enum in methods  >  Error: enum types must not be local
    
    Coffee drink = new Coffee();   
    drink.size = CoffeeSize.BIG;
  }
  
}