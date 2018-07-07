public class Horse extends Animal {
  private Halter myHalter = new Halter();
  public void tie(LeadRope rope) {
    myHalter.tie(rope);  // Delegate tie behavior to the Halter
  }
  
  // test code
  public static void main(String[] args) {
    Horse h = new Horse();
    h.tie(new LeadRope());
  }
}