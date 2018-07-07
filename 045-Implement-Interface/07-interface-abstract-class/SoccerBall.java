class SoccerBall extends Ball {
  // class SoccerBall must implements the interface methods that Ball dind't
  public void moveIt() {  }
  
  public void doSphericalThing() {  }
  
  // SoccerBall can choose to override the Bounceable methods
  // implemented by Ball
  public void bounce() { }
}


abstract class Ball implements Bounceable {
  public void bounce() { }                 // Define bounce behavior
  public void setBounceFactor(int bf) { }
  // DON'T IMPLEMENT THE REST; LEAVE IT FOR A SUBCLASS
  //interface method : moveIt()
  //interface method : doSphericalThing() 
}

interface Bounceable extends Moveable, Spherical { // ok!
  void bounce();
  void setBounceFactor(int bf);
}

interface Moveable {
  void moveIt();
}

interface Spherical {
   void doSphericalThing();
}