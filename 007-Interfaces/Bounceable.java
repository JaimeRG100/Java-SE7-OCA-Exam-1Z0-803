
//public abrstract interface Rollable
//interface classes are implicitly ABSTRACT
public interface Bounceable {
  
  // valid constants declarations
  int a = 1;
  public int b = 2;
  static int c = 3;
  final int d = 4;
  public static int e = 5;
  public final int f = 6;
  static final int g = 7;
  public static final int h = 8;  
  
  //public abstract void bounce();
  //public abstract void setBounceFactor();
  //methods are implicitly PUBLIC and ABSTRACT
  void bounce();  
  void setBounceFactor();  
  
  
}