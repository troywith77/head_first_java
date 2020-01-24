class Player {
  int number = 0;
  public void guess() {
    number = (int) (Math.random() * 10);
    System.out.println("I'm guessing " + number);
  }
}

class GuessGame {
  Player p1;
  Player p2;
  Player p3;
  public void startGame() {
    p1 = new Player();
    p2 = new Player();
    p3 = new Player();

    boolean p1_right = false;
    boolean p2_right = false;
    boolean p3_right = false;

    int target_number = (int) (Math.random() * 10);
    System.out.println("I'm thinking of number " + target_number);

    while (true) {
      p1.guess();
      p2.guess();
      p3.guess();

      if (p1.number == target_number) {
        p1_right = true;
      }
      if (p2.number == target_number) {
        p2_right = true;
      }
      if (p3.number == target_number) {
        p3_right = true;
      }

      if (p1_right || p2_right || p3_right) {
        System.out.println("We have a winner!");
        System.out.println("Player one got it right? " + p1_right);
        System.out.println("Player two got it right? " + p2_right);
        System.out.println("Player three got it right? " + p3_right);
        System.out.println("Game is over.");
        break;
      } else {
        System.out.println("Players will have to try again.");
      }
    }
  }
}

public class GuessGameLauncher {
  public static void main(String[] args) {
    GuessGame game = new GuessGame();
    game.startGame();
  }
}