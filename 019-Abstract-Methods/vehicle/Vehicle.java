public abstract class Vehicle {
  private String type;
  
  public abstract void goUpHill();
  public String getType(){          // Abstract method
    return type;                    // Non-abstract method
  }
  
}