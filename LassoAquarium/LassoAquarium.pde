//import java.util.Random;

//class Prey {
//  int x = 9;
//  PImage[] frames = new PImage[x];
//  int noFrames;
//  float x = random(-200, 1200);
//  float y = random(100, 300);
//  Random r;
  
//  Prey () {
//    r = new Random();
//    noFrames = 0;
//  }
  
//  void addFrame(PImage frame) {
//    frames[noFrames] = frame;
//    ++noFrames;
//  }

//  //void move(Creature[][] grid, int x, int y) {
//  //  grid[x][y] = this;
//  //  int direction = r.nextInt(5); // 0: stay, 1: up, 2: down, 3: left, 4: right
//  //  switch(direction) {
//  //    case 0:
//  //      grid[x][y] = this; // repopulate spot
//  //      break;
//  //    case 1:
//  //      if (y > 0) {
//  //        grid[x][y-1] = this;
//  //      }
//  //      break;
//  //    case 2:
//  //      if ((y+1) < (grid[0].length)) {
//  //        grid[x][y + 1] = this;
//  //      }
//  //      break;
//  //    case 3:
//  //      if (x > 0) {
//  //        grid[x-1][y] = this;
//  //      }
//  //      break;
//  //    case 4:
//  //      if ((x + 1) < (grid.length)) {
//  //        grid[x + 1][y] = this;
//  //      }
//  //      break;
//  //    default:
//  //      grid[x][y] = this; // repopulate spot
//  //      break;
//  //  }
//  //}
  
//  void move() {
//   x = x + 5;
//   if (x > width + 100) {
//     x = -250;
//     y = random(0, 400);
//   }
//   y = y + random(-2, 2);
//  }

//  void draw() {
//    image( frames[frameCount % noFrames], x, y );
//  }
//}
