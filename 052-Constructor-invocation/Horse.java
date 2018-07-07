// The only way a constructor can be invoked is from within another constructor.
// In other words, you can't write code that actually calls a constructor as follows:
class Horse {
  Horse() { } // constructor
  void doStuff() {
    Horse(); // calling the constructor - illegal!
  }
}