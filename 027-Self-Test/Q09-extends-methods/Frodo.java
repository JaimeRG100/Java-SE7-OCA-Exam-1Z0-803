public class Frodo extends Hobbit {
  
  public static void main(String[] args) {
    int myGold = 7;
    System.out.println(countGold(myGold, 6)); // Error:  non-static method countGold(int,int) cannot be referenced from a static context
                                              // To generate 13 as output, the code should be:
                                              // System.out.println(new Hobbit().countGold(myGold, 6));
  }

}

class Hobbit {
  int countGold(int x, int y) { return x + y; }
}