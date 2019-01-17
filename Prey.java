import java.util.Random;

public class Prey {
  private Random r;
  public Prey () {
    r = new Random();
  }

  public void move(int[][] grid, int x, int y) {
    grid[x][y] = 0;
    int direction = r.nextInt(5); // 0: stay, 1: up, 2: down, 3: left, 4: right
    switch(direction) {
      case 0:
        grid[x][y] = 2; // repopulate spot
        break;
      case 1:
        if (y > 0) {
          grid[x][y-1] = 2;
        }
        break;
      case 2:
        if ((y+1) < (grid[0].length)) {
          grid[x][y + 1] = 2;
        }
        break;
      case 3:
        if (x > 0) {
          grid[x-1][y] = 2;
        }
        break;
      case 4:
        if ((x + 1) < (grid.length)) {
          grid[x + 1][y] = 2;
        }
        break;
      default:
        grid[x][y] = 2; // repopulate spot
        break;
    }
  }
}
