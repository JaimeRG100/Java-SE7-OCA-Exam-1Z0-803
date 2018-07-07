interface Gadget {
  void doStuff();                                            // by default is public
}

abstract class Electronic {
  void getPower() { System.out.print("plug in "); }
}

public class Tablet extends Electronic implements Gadget {
  void doStuff() { System.out.print("show book "); }          // interace method are public, so the Tablet.doStuff method must be public, too
  
  public static void main(String[] args) {
    new Tablet().getPower();
    new Tablet().doStuff();
  }
}