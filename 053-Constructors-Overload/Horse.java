// Horse class with two constructors:
class Horse {
  Horse() { }
  Horse(String name) { }
}

// The compiler won't insert a default constructor
class Horse2 {
  Horse2(String name) { }
}

// The compiler will generate a default constructor
class Horse3 { }


// It isn't a constructor at all! 
// It's simply a method that happens to have the same name as the class.
class Horse4 {
void Horse4() { }
}
