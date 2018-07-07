public class A {
  public static void main(String[] args) {
    //Size
    B b = new B();
    int x = b.getSize();
    System.out.print(x + " > ");
    b.setSize(34);
    System.out.println(b.getSize());
    
    //Name
    System.out.print(b.getName() + " > ");
    String s = b.getName();
    b.setName("Fred");
    System.out.println(b.getName());
    
    Color c = b.getColor();
    Color blue = new Color("blue");
    b.setColor(blue);
    System.out.println(b.getColor().getColor());  // WOW
  }
  
}