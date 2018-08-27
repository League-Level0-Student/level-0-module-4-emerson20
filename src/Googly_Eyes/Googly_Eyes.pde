void setup() {
  size(800, 500);
  PImage face = loadImage("Hermione.jpg");
  face.resize(800, 500);
  background(face);
}
void draw() {
 
   fill(255, 255, 255);
   ellipse(268, 175, 150, 75);
   fill(0, 0, 0);
   ellipse(constrain(mouseX, , ),constrain(mouseY, , ), 40, 40);
   fill(255, 255, 255);
   ellipse(536, 170, 155, 75);
   fill(0, 0, 0);
   ellipse(mouseX, mouseY, 40, 40);
}