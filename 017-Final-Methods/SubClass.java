class SubClass extends SuperClass {
  
  public void showSample() {  // Error: showSample() in SubClass cannot override showSample() in SuperClass
    System.out.println("Another thing");
  }
}