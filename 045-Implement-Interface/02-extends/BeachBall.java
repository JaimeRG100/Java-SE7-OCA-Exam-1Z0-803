class BeachBall extends Ball {
  // Even though we don't say in the calss declarion above,
  // BeachBall implements Bounceable, since Beachball's abstract
  // superclass (Ball) implements Bounceable
  
  public void bounce() {
    // interesting BeachBall-specific bounce code
  }
  
  public void setBounceFactor(int bf) {
    //clever BeachBall-specific code for setting
    // a bounce factor
    
  }
  // if class Ball defined any abstract methods,
  // they'll have to be
  // implemented here as well.
}

abstract class Ball implements Bounceable {

}