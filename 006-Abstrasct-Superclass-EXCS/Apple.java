import food.Fruit;

class Apple extends Fruit {
  
  public void Fruit(){
    //color, name and flavour has private access in food.Fruit
    //super.color = "none";
    //super.name = "none";
    //super.flavour = "none"; 
  }
  
  public void eat(){
    System.out.println("Apple was eated");
  }
  
  public void setName(String name){
    super.setName(name);
  }
  
  public String getName(){
    return super.getName();    
  }
  
  
  // Test code 
  public static void main(String[] args){
    Apple appleOne = new Apple();
    appleOne.setName("red apple");
    System.out.println("Your apple name now is: " + appleOne.getName());
  
  }
}