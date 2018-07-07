class TestServer {  
  private int x;
  
  public void login(){
    int count = 10;                          // before a local variable can be used, it mus be initialized
    System.out.println("tx: " + x);          // instance variables are auto initialized (in constructor)
    System.out.println("count: " + count);   // if it wasn't initialize, generates an Error: variable count might not have been initialized
  }
  
  //test code
  public static void main(String[] args) {
    TestServer ts = new TestServer();
    ts.login();
    
  }
  
}