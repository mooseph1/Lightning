int startX = (int)(Math.random()*301);
int startY = 0;
int endX = 150;
int endY = 0;
int cloud = 0;
void setup()
{
  size(300,300);
  background(0);
  strokeWeight(3);
}
void draw()
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
void mousePressed()
{
	startX = (int)(Math.random()*301);
	startY = 0;
	endX = 150;
	endY = 0;
	cloud = 0;
}

