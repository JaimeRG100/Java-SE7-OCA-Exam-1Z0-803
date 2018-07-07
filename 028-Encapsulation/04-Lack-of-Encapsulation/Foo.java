class Foo {
  public int left = 9;    // instance variables must not be public
  public int right = 3;   // it looks like right always going to be one-third the value of left
                          // users must not access directly to instance variables
  
  public void setLeft(int leftNum) {
    left = leftNum;
    right = leftNum / 3;
  }
}