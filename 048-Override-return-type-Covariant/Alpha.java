class Alpha {
  Alpha doStuff(char c) {
    return new Alpha();
  }  
}

class Beta extends Alpha {
  Beta doStuff(char c) {  // legal override
    return new Beta();
  }
}

// compile with other java version
// javac -source 1.4 Beta.java