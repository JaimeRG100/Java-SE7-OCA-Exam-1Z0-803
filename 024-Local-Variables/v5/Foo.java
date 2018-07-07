class Foo {  
  int size = 27;
  
  public void setSize(int size) {
    System.out.println("Before: " + this.size);
    this.size = size;
    System.out.println("After: " + this.size);
  }

  
  //test code
  public static void main(String[] args) {
    new Foo().setSize(10);

  }  
}