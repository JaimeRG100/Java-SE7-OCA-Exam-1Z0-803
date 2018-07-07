public class MethodWithVarArgs {
  
  void doStuffOne(String a, int b) {
    // code goes here
  }
  
  void doStuffTwo(int... x) {
    // code goes here
  }
  
  void doStuffThree(char c, int... x) {
    // code goes here
  }
  
  /* -----------------------------------------
  void doStuffFour(int x...){   // bad syntax
    // code goes here
  }
  
  void doStuffFive(int... x, int... y){   // to many var-args
    // code goes here
  }
  
  void doStuffSix(String... s, byte b){   // var-arg must be last
    // code goes here
  }  
  ----------------------------------------- */
  
  
}