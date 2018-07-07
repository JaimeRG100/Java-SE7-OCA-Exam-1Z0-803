public class TestShapes {
  public static void main(String[] args) {
    PlayerPiece shape = new PlayerPiece();
    shape.displayShape();
    shape.movePiece();
  }
}

class GameShape {
  public void displayShape() {
    System.out.println("displaying shape");
  }
}

class PlayerPiece extends GameShape {
  public void movePiece() {
    System.out.println("moving game piece");
    // output:
    // displaying shape 
    // moving game piece 
  }
}

