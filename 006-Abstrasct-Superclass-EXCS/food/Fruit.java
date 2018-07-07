package food;

public abstract class Fruit{
  private String color;
  private String name;
  private String flavour;
  public abstract void eat();
  public void setName(String name){
    this.name = name;
  };
  public String getName(){
    return this.name;
  }
  
  
}