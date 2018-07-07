interface Bounceable extends Moveable, Spherical { // ok!
  void bounce();
  void setBounceFactor(int bf);
}

interface Moveable {
  void moveIt();
}

interface Spherical {
  void soSphericalThing();
}