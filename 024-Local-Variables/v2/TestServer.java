class TestServer {  
  
  public void login(){
    int count = 10;
  }
  
  public void doSomething(int i) {
    count = i;                 //Won't compile! Can't access count outside method login()
  }
  
}