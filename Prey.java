import java.util.Random;

public class Prey extends Creature{
  private Random r;
  public Prey () {
    r = new Random();
  }

  public void move(Creature[][] grid, int x, int y) {
    grid[x][y] = this;
    int direction = r.nextInt(5); // 0: stay, 1: up, 2: down, 3: left, 4: right
    switch(direction) {
      case 0:
        grid[x][y] = this; // repopulate spot
        break;
      case 1:
        if (y > 0) {
          grid[x][y-1] = this;
        }
        break;
      case 2:
        if ((y+1) < (grid[0].length)) {
          grid[x][y + 1] = this;
        }
        break;
      case 3:
        if (x > 0) {
          grid[x-1][y] = this;
        }
        break;
      case 4:
        if ((x + 1) < (grid.length)) {
          grid[x + 1][y] = this;
        }
        break;
      default:
        grid[x][y] = this; // repopulate spot
        break;
    }
  }

  public String toString() {
    return "2";
  }
}
