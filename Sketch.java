import processing.core.PApplet;
import processing.core.PImage;
 
public class Sketch extends PApplet {
 
 PImage flame;
 PImage smore;
 PImage grass;
 PImage cloud;
 PImage Frogue;
 PImage tree;
 
 float cloudX = 150;
 String message = "";
 
 /**
  * Called once at the beginning of execution, put your size all in this method
  */
 public void settings() {
 // put your size call here
   size(400, 400);
 }
 
 /**
  * Called once at the beginning of execution.  Add initial set up
  * values here i.e background, stroke, fill etc.
  */
 public void setup() {
   background(random(1, 255), random(1, 255), random(1,255));
   //Load in all the images
   flame = loadImage("Flamamabobob.png");
   smore = loadImage("S more.png");
   grass = loadImage("Grass.png");
   cloud = loadImage("Cloud.png");
   Frogue = loadImage("Frogue.png");
   tree = loadImage("reeee.jpeg");
   textSize(15);
 }
 //Declare the Variables for the frog
 float frogueX = 50;
 float frogueY = 50;
 /**
  * Called repeatedly, anything drawn to the screen goes here
  */
 public void draw() {
   //Message when typing
  
   text(message, 25, 150);
   /*
   if (mousePressed) {
     fill(random(1, 255));
   image(smore, mouseX, mouseY);
   }
   */
  
 }
 //Actually type your message
 public void keyTyped() {
   message += key;
 }
 //When you click your mouse, a randomly sized, randomly coloured rectangle will appear where your mouse is. Disappears when you type a key unless on the bottom of the screen.
 public void mouseClicked() {
   fill(random(1,255), random(1, 255), random(1,255));
   rect(mouseX, mouseY, random(1,100), random(1, 100));
 }
 //When you press your mouse, a randomly sized, randomly coloured circle will appear at a random location. Disappears when you type a key unless on the bottom of the screen.
 public void mousePressed(){
   fill(random(1,255), random(1, 255), random(1,255));
   ellipse(random(1, 400), random(1, 400), random(1,100), random(1, 100));
 }
  //When you drag your mouse, an image of grass will appear at the bottom of the   screen. Top disappears when you type a key, as it gets covered by the tree background image.
  public void mouseDragged(){
   image(grass, random(-50, 400), 200);
 }
 //When you scroll your mouse, an image of a flame will appear where your mouse is. Disappears when you type a key, unless on the bottom of screen.
 public void mouseWheel() {
  
   image(flame, mouseX, mouseY);
 
 }
 public void keyPressed(){
   image(tree, 0, 0);
   //Resets the background to a random colour whenever the shift key is pressed
   if (keyCode == SHIFT) {
     background(random(1, 255), random(1,255), random(1,255));
   }
  
   // when a key is pressed, a cloud appears on the screen. Move the cloud by typing "g" and "h"
   if(key == 'g'){
     cloudX--;
   }
   else if(key == 'h'){
    cloudX++;
   }
   image(cloud, cloudX, 50);
   // when a key is pressed, a frog appears on the screen. Move the frog using the arrow keys.
   if (keyCode == UP) {
     frogueY--;
   }
   else if (keyCode == DOWN) {
     frogueY++;
   }
   else if(keyCode == LEFT){
     frogueX--;
   }
   else if(keyCode == RIGHT){
    frogueX++;
   }
   image(Frogue, frogueX, frogueY);
 
 }
 /*
 
 
 public void mouseClicked() {
   fill(0, 255, 0);
   image(flame, mouseX-20, mouseY-20);
 }
 */
 // define other methods down here.
}

