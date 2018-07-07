public class B {
  private int size = 0;
  private String name = "";
  private Color color = new Color();
  
  public int getSize(){
    return size;
  }
  
  public void setSize(int size){
    this.size = size;
  }
    
  public String getName(){
    return name;
  }
  
  public void setName(String name){
    this.name = name;
  }
  
  public Color getColor(){
    return color;
  }
  
  public void setColor(Color color){
    this.color = color;
  }
  
}

class Color {
  private String color = "";
  
  Color() {
    color = "none";
  }
  
  Color(String color){
    this.color = color;
  }
  
  public String getColor(){
    return color;
  }
  
  public void setName(String color){
    this.color = color;
  }
  
}