enum CoffeeSize { BIG, HUGE, OVERWHELMING };   // <-- semicolon is optional

class Coffee {    
  CoffeeSize size;
}
  
public class CoffeeTest4 {  
  
  public static void main(String[] args){
    
    Coffee drink = new Coffee();   
    drink.size = CoffeeSize.BIG;
  }
  
}