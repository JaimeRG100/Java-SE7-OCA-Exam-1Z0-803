abstract class Car {
  private double price;
  private String model;
  private String year;
  public abstract void goFast();
  public abstract void goUpHill();
  public abstract void impressNeighbors();
  //Aditional, important and serioud code goes here
  
  //The code below was added by me (the programmer)
  public void getDiscount(){
    System.out.println("10% off, final price: " + price * 0.9);
  }
  
  //Test code
  public static void main(String[] args){
    // abstract class can't been instantiated
    //Car x = new Car();
  
  }
  
  
}