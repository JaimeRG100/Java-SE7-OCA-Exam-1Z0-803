public class Ball implements Bounceable { // Keyword
  // 'implements'
  public void bounce() { }
  public void setBounceFactor(int bf) { }
}

abstract class Ball_2 implements Bounceable { }    // valid

interface Bounceable { // Keyword 'implements'
  public void bounce();
  public void setBounceFactor(int bf);
}

/*
 This has got to be the worst implementation class in the history 
 of implementation classes." It compiles, though. And it runs. The
 interface contract guarantees that a class will have the method 
 (in other words, others can call the method subject to access 
 control), but it never guaranteed a good implementation.
 */