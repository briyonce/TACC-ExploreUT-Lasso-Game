class Prey {
   // global members
   PImage[] frames = new PImage[8];
   int noFrames = 0;
   float x =random( -200, 1200 );
   float y = random( 100, 300 );
   
   Prey() {
     noFrames = 0;
   }
   
   // add a new frame to the fish.  The max number is 8.
   void addFrame( PImage frame ) {
     frames[ noFrames ] = frame;
     noFrames++;
   }
   
   // move the fish to the right, and if off the tank image, 
   // bring it back to the left.
   void move() {
     x = x + 5;
     if ( x > width+100)  {
        x = -250;
        y = random( 0, 400 );
     }
     y = y + random( -2, 2 );
   }
   
   
   // draw a new frame of the fish.
   void draw() {
     image( frames[frameCount%noFrames], x, y );
   }

}
