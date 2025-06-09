package _06_frogger;
import processing.core.PApplet;
public class Car {
	int x;
	int y;
	int size;
	int speed;
	int dir;
	Car(int x, int y, int size, int speed, int dir)
	{
		this.x = x;
		this.y = y;
		this.speed = speed;
		this.size = size;
		this.dir = dir;
	}
	public void setup()
	{
		
	}
	public void draw() {
		
	}
	public void display()
	  {
	   fill(0,0,0);
	   rect(x,y,size,size);
	   
	  }
	int getX()
	{
		return x;
	}
	int getY()
	{
		return y;
	}
	int getSize()
	{
		return size;
	}
	int getSpeed()
	{
		return speed;
	}
	void move()
	{
		if(dir == 0)
		{
			x--;
		}
		else if(dir == 1)
		{
			x++;
		}
	}
	

}
