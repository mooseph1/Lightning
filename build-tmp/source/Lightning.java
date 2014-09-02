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

public class Lightning extends PApplet {

int startX = (int)(Math.random()*301);
int startY = 0;
int endX = 150;
int endY = 0;
int cloud = 0;
public void setup()
{
  size(300,300);
  background(0);
  strokeWeight(3);
}
public void draw()
{
	stroke(random(0,256),random(0,255),random(0,256));
	while (endY < 300)
	{
		endX = startX + (int)(Math.random()*20-10);
		endY = startY + (int)(Math.random()*10);
		line(startX,startY,endX,endY);
		startX = endX;
		startY = endY;
	}
	while (cloud < 301)
	{
		noStroke();
		fill(130);
		ellipse(cloud,0,70,70);
		cloud = cloud + 50;
	}
}
public void mousePressed()
{
	startX = (int)(Math.random()*301);
	startY = 0;
	endX = 150;
	endY = 0;
	cloud = 0;
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
