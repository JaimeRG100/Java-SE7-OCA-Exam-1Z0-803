class Foo {  
  int size = 27;
  
  public void setSize(int size) {
      size = size;     // ??? which size equals which size ???
                       // no change was maded, it should be this.size = size;
      System.out.println(size);
    }

  
  //test code
  public static void main(String[] args) {
    new Foo().setSize(10);

  }  
}