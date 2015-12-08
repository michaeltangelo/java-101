import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class DrDetective extends PApplet {

/**
 * The stakes have never been higher. Criminal Mastermind Irab Essana is on a rampage!
 * It's up to you, Doctor Detective, to discover Irab's true identity.
 * Tread lightly. You have been warned.
 * @author Michael Tan <michaeltan@nyu.edu>
 * @version 1.0
 * @since 2015-12-08
 */

// time for text to display prior to game start
int freezeTime = 150;

// countdown timer value
int countdown = 800;

// create new SurpriseImage class
SurpriseImage img;
int regionSize = 25;

public void setup() {
    
    // set bg color to black
    background(0);
    // create new SurpriseImage (string filename)
    img = new SurpriseImage("surprise.jpg");
}

public void draw() {
    // if the timer is 0, reveal the surprise image
    if (countdown <= 0) {
      image(loadImage("surprise.jpg"),0,0);
    }
    // pauses at beginning of game
    if (freezeTime >= 50){
      background(0);
      textSize(30);
      text("IDENTIFY THE CRIMINAL MASTERMIND", 90, 60);
      freezeTime -= 1;
    }
    // displays 2nd part of introductory text -> game still frozen
    else if (freezeTime > -50) {
      background(0);
      fill(255,255,255);
      textSize(30);
      text("IDENTIFY THE CRIMINAL MASTERMIND", 90, 60);
      textSize(20);
      text("(before it's TOO LATE...)", 250, 90);
      freezeTime -= 1;
    }
    
    // game start
    else {
      // if the countdown is positive, clear the countdown timer with a black box
      if (countdown > 0) {
        fill(0);
        rect(315,100,200,100);
      }
      // add a region constraint around the mouse
      int xstart = constrain(mouseX-regionSize/2,0,width);
      int ystart = constrain(mouseY-regionSize/2,0,height);
      int xend = constrain(mouseX+regionSize/2,0,width);
      int yend = constrain(mouseY+regionSize/2,0,height);
     
      loadPixels();
      // replace each pixel in region with background image color
      for (int x = xstart; x < xend; x++) {
        for (int y = ystart; y < yend; y++) {
          int replaceColor = img.getBGColorAtPos(x,y);
          int pixelLocation = x + y*width;
          pixels[pixelLocation] = replaceColor;
        }
      }
      updatePixels();
      
      stroke(0);
      noFill();
      rect(xstart,ystart,regionSize,regionSize);
      
      // display text
      textSize(35);
      // WHITE
      if (countdown > 650) {
        fill(255,255,255);
      }
      // YELLOW
      else if (countdown > 400) {
        fill(255,255,0);
      }
      // ORANGE
      else if (countdown > 250) {
        textSize(40);
        fill(255,128,0);
      }
      // DARK ORANGE
      else if (countdown > 100) {
        textSize(45);
        fill(255,75,0);
      }
      // RED
      else if(countdown > 0) {
        textSize(55);
        fill(255,0,0);
      }
      // displays "you lose" message
      else if (countdown < 0) {
        fill(0xff224488);
        text("System.out.println(\"YOU LOSE\");",125,250);
        fill(255,0,0);
        // makes a second copy several pixels offset for a '3d' effect
        text("System.out.println(\"YOU LOSE\");",122,247);
        return;
      }
      // displays timer and decrements it per frame
      text(countdown, 335, 150);
      countdown -= 1;
    }
}
// class for storing a pixel's RGB color values
// used to simplify processing RGB values
public class RGBValue {
    private float r;
    private float g;
    private float b;
    private int Color;
    
    public RGBValue(float r, float g, float b) {
        this.r = r;
        this.g = g;
        this.b = b;
        this.Color = color(r,g,b);
    }
    
    public float getR() {
        return this.r;
    }
    
    public float getG() {
        return this.g;
    }
    
    public float getB() {
        return this.b;
    }
    
    public int getColor() {
        return this.Color;
    }
}
// image class for processing background image
class SurpriseImage {
    // declare PImage img
    PImage img;
    // constructs PImage based on String constructor (received from main app)
    public SurpriseImage(String imageName) {
        img = loadImage(imageName);
    }
    // receives x and y coordinate and returns RGBValue in a color object
    public int getBGColorAtPos(int x, int y) {
        int pixelLoc = x + y*width;
        int pixelData = img.pixels[pixelLoc];
        RGBValue rgb = new RGBValue(red(pixelData), green(pixelData), blue(pixelData));
        return rgb.getColor();
   }
}
  public void settings() {  size(750,750); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--present", "--window-color=#666666", "--stop-color=#cccccc", "DrDetective" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
