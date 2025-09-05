package _06_frogger;

import processing.core.PApplet;
import java.awt.AWTKeyStroke;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class Frogger extends PApplet{
    static final int WIDTH = 600;
    static final int HEIGHT = 400;
    int frogX = 300;
    int frogY = 350;
    Car car = new Car(50,50,75,1,1);
    Car care = new Car(550,110,75,2,2);
    Car carr = new Car(378,170,75, 1, 2);
    Car carer = new Car(0,230,75,3,1);
    
	
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	
    }

    @Override
    public void draw() {
    background(247, 215, 126);
    fill(94, 189, 70);
    ellipse(frogX, frogY, 50, 50);
    car.display();
    car.move();
    care.display();
    care.move();
    carr.display();
    carr.move();
    carer.display();
    carer.move();
    if(intersects(car))
    {
    	frogX = 300;
    	frogY = 350;
    }
    else if(intersects(care))
    {
    	frogX = 300;
    	frogY = 350;
    }
    else if(intersects(carr))
    {
    	frogX = 300;
    	frogY = 350;
    }
    else if(intersects(carer))
    {
    	frogX = 300;
    	frogY = 350;
    }
    }
   
    
    
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
    
        void bounds() {
    	if(frogY > HEIGHT)
    	{
    		frogY = HEIGHT;
    	}
    	if(frogX > WIDTH)
    	{
    		frogX = WIDTH;
    	}
}
    boolean intersects(Car car) {
    	 if ((frogY > car.getY() && frogY < car.getY()+50) &&
    	                (frogX > car.getX() && frogX < car.getX()+car.getSize())) {
    	   return true;
    	  }
    	 else  {
    	  return false;
    	 }
    	 }
    	
    	public void keyTyped()
    	{
    		
    	}
    
    	public void keyReleased()
    	{
    	
    	}
    	
    	 public void keyPressed()
    	 {
    		 System.out.println("meow meow meow meow meow");
    	     if(key == CODED){
    	         if(keyCode == UP)
    	         {
    	        	 frogY-=5;
    	             //Frog Y position goes up
    	         }
    	         else if(keyCode == DOWN)
    	         {
    	        	 frogY+=5;
    	             //Frog Y position goes down 
    	         }
    	         else if(keyCode == RIGHT)
    	         {
    	        	 frogX+=5;
    	             //Frog X position goes right
    	         }
    	         else if(keyCode == LEFT)
    	         {
    	        	 frogX-=5;
    	             //Frog X position goes left
    	         }
    	     }
}
    class Car{
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
    		 fill(92,187,233);
    		 rect(x , y,  size, 50);
    	  }
    	int getY()
    	{
    		return y;
    	}
    	int getSize() {
    		return size;
    	}
    	int getX()
    	{
    		return x;
    	}
    	void move()
    	{
    		if(dir == 1)
    		{
    			x+=speed;
    			if(x == 600)
    			{
    				x = 0;
    			}
    		}
    		if(dir == 2)
    		{
    			x-=speed;
    			if(x == 0)
    			{
    				x = 600;
    			}
    		}
    		
    	}

    }
}
