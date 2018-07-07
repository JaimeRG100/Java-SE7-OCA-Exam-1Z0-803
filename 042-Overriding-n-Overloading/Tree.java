public class Tree {
  void showLeaver() {}
  
  void setFeatures(String name) {}
}

class Oak extends Tree {
  //Overriding
  void showLeaver() {}
  
  //Overloading
  void setFeatures(String name, int leafSize) {}
  void setFeatures(int leafSize) {}
  
}