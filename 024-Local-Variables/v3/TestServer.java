class TestServer {  
  int count = 9;        // declara an instance variable named count
                        // without public or private modifier, it get dafault access (package)
  
  public void login(){
    int count = 10;     // declare a local variable named count
    System.out.println("local variable count is " + count);
  }
  
  public void count() {
    System.out.println("instance variable count is " + count);
  }
  
  //test code
  public static void main(String[] args) {
    new TestServer().login();
    new TestServer().count();        
  }  
}