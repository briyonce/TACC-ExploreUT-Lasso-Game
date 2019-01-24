PImage img;
PImage[] fish = new PImage[2];
int fishX = -100, fishY = height/2;

public void settings() {
  size(1000, 600);
}

void setup() {
  smooth();
  img = loadImage( "Aquarium.jpg" );
  fish[0] = loadImage( "fish0" );
  fish[1] = loadImage( "fish1" );
}

void draw() {
  image( img, 0, 0, width, height );
  image( fish[frameCount%8], fishX, fishY );
  fishX = fishX + 5;
  if ( fishX > width+100)  {
      fishX = -250;
  }
}
