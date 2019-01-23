import java.util.Random;

public class Prey extends Creature{
  private Random r;
  //contain prey's location within the prey
  private int x_coord;
  private int y_coord;
  
  public Prey () {
    r = new Random();
  }
  
  //initializer that allows us to start at specified location in grid
  public Prey(int x, int y){
    r = new Random();
    x_coord = x;
    y_coord = y;
  }
  
  public void move(Creature[][] grid, int x, int y){
    assert(grid[x][y] == this);
    int direction = r.nextInt(9); // 0: stay, 1: up, 2: down, 3: left, 4: right, 5 up-right, 6 up-left, 7 down-right, 8 down-left
    switch(direction) {
      case 0:
        grid[x][y] = this; // repopulate spot
        break;
      case 1:
        if (y > 0) {
          grid[x][y-1] = this;
          grid[x][y] = Null;
        }
        break;
      case 2:
        if ((y+1) < (grid[0].length)) {
          grid[x][y + 1] = this;
          grid[x][y] = Null;
        }
        
        break;
      case 3:
        if (x > 0) {
          grid[x-1][y] = this;
          grid[x][y] = Null;
        }
        break;
      case 4:
        if ((x + 1) < (grid.length)) {
          grid[x + 1][y] = this;
          grid[x][y] = Null;
        }
        break;
      case 5:
        grid[x][y] = Null;
        x = x + 1 < (grid.length) ? x + 1 : x;
        y = y > 0 : y - 1: y;
        grid[x][y] = this;
        break;
      case 6:
        grid[x][y] = Null;
        x = x > 0 ? x -1 1 : x;
        y = y > 0 : y - 1: y;
        grid[x][y] = this;
        break;
      case 7:
        grid[x][y] = Null;
        x = x + 1 < (grid.length) ? x + 1 : x;
        y = y + 1 < grid[0].length : y + 1: y;
        grid[x][y] = this;
        break;
      case 8:
        grid[x][y] = Null;
        x = x > 0 ? x -1 1 : x;
        y = y + 1 < grid[0].length : y + 1: y;
        grid[x][y] = this;
        break;
      default:
        grid[x][y] = this; // repopulate spot
        break;
  }
  
  
  //my guy? what are you trying to do here?
  //is this how you first place the fish? or what? there's a lot of moving parts here?
  //if this is supposed to take care of a single move, the fish should already be in that location.
  //this is can potentially leave 2 fish on the board. one in the initial location and then one in the location it moved to
  //i may be wrong, i ain't programmed in a minute. 
  public void move(Creature[][] grid, int x, int y) {
    grid[x][y] = this;
    int direction = r.nextInt(9); // 0: stay, 1: up, 2: down, 3: left, 4: right, 5 up-right, 6 up-left, 7 down-right, 8 down-left
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
