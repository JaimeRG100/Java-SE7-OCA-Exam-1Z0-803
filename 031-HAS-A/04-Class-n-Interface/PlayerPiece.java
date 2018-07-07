public class PlayerPiece extends GameShape implements Animatable {
  public void movePiece() {
    System.out.println("moving game piece");
  }
  
  public void animate() {
    System.out.println("animating...");
  }
  
  //more code
  
  public static void main(String[] args) {
    // book test code
    PlayerPiece player = new PlayerPiece ();
    Object o = player;
    GameShape shape = player;
    Animatable mover = player;
    
    // my test code
    mover.animate();
    //mover.movePiece();   // this should not work : interface has not that method
    
    PlayerPiece pp = new PlayerPiece();
    pp.movePiece();
    pp.animate();
  }
  
  
}
