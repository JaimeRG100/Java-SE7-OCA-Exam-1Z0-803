class Bar {
  void takeInt(int x) { }
}

class UseBar {
  public static void main (String [] args) {
    Bar b = new Bar();
    b.takeInt(); // Try to invoke a no-arg takeInt() method
  }
}