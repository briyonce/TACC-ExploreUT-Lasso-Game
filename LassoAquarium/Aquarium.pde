Prey[] schoolOfFish; // the array containing all the fish
int maxNoFish = 10;  // the total number of fish displayed
PImage tank;

public void settings() {
  size(1000, 600);
}

void setup() {
  // window geometry 
  smooth();
  
  // get the background image of the aquarium tank. 
  // This will be displayed every time draw() is called.
  tank = loadImage( "aquarium.jpg" );
  
  // create the collection of images making up the animation
  // for a given fish.
  PImage[] images = new PImage[8];
  images[0] = loadImage( "fish0.gif" );
  images[1] = loadImage( "fish1.gif" );

  // create the school of fish
  schoolOfFish = new Prey[maxNoFish];
  for ( int fishNo = 0; fishNo < maxNoFish; fishNo++ ) {
    // new fish
    schoolOfFish[ fishNo ] = new Prey( );

    // add 8 frames for each fish.  Do not 
    // start with frame 0 for all fish, so that
    // they will not be synchronized.
    for ( int i=0; i<8; i++ ) { 
     schoolOfFish[ fishNo ].addFrame( 
           images[ (i + fishNo*2 ) % 8 ] );
    }
  }
  
  // set the frame rate to 10, so that fish are not
  // swimming too fast.
  frameRate( 10 );
}


void draw() {
  //--- Animation loop ---
  
  // display the background image.  This erases the previous
  // images of the fish, so that we can draw newer frames,
  // offset by some tiny amount.
  image( tank, 0, 0, width, height );
  
  // display new frame for each fish, then move the fish
  // forward.
  for ( int fishNo = 0; fishNo < maxNoFish; fishNo++ ) { 
    schoolOfFish[ fishNo ].draw();
    schoolOfFish[ fishNo ].move();
  }  
}
