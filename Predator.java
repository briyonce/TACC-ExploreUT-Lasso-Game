import javafx.util.*;

public class Predator {
  public Predator() {

  }

  // checks area (ring) around predator at a certain radius like a radar.
  // If Prey is detected, return the corresponding coordinate.
  private Pair<Integer, Integer> nearEnemy(int[][] grid, int x, int y, int radius) {
    if (y >= radius) {
      if (grid[x][y-radius] == 2) {
        return new Pair<>(x,y-radius);
      }
    }
    if ((y + radius) < grid[0].length - radius) {
      if (grid[x][y+radius] == 2) {
        return new Pair<>(x,y+radius);
      }
    }
    if (x >= radius) {
      if (grid[x-radius][y] == 2) {
        return new Pair<>(x-radius,y);
      }
      if (y >= radius) {
        if (grid[x - radius][y - radius] == 2) {
          return new Pair<>(x-radius,y-radius);
        }
      }
      if ((y + radius) < (grid[0].length - radius)) {
        if (grid[x-radius][y+radius] == 2) {
          return new Pair<>(x-radius,y+radius);
        }
      }
    }
    if ((x + radius) < (grid.length - radius)) {
      if (grid[x+radius][y] == " x") {
        return new Pair<>(x+radius, y);
      }
      if (y >= radius) {
        if (grid[x+radius][y-radius] == 2) {
          return new Pair<>(x+radius,y-radius);
        }
      }
      if ((y + radius) < (grid[0].length - radius)) {
        if (grid[x+radius][y+radius] == 2) {
          return new Pair<>(x+radius,y+radius);
        }
      }
    }
    return new Pair<>(x,y);
  }

}
