package _06_frogger;

import processing.core.PApplet;
import java.awt.AWTKeyStroke;

public class Frogger extends PApplet {
    static final int WIDTH = 600;
    static final int HEIGHT = 400;
    int frogX = 50;
    int frogY = 30;

	Car car = new Car(40,55,10,25,1);
	Car car1 = new Car(30,70,10,25,0);
	Car car2 = new Car(65, 85, 10,25,1);
	Car car3 = new Car(15,100,10,25,0);
	Car car4 = new Car(200,115,10,25,1);
	
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
    ellipse(50, 30, 50, 50);
    }
   

    
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
    void keyPressed()
    {
        if(key == CODED){
            if(keyCode == UP)
            {
                //Frog Y position goes up
            	frogY++;
            }
            else if(keyCode == DOWN)
            {
                //Frog Y position goes down 
            	frogY--;
            }
            else if(keyCode == RIGHT)
            {
                //Frog X position goes right
            	frogX++;
            }
            else if(keyCode == LEFT)
            {
                //Frog X position goes left
            	frogX--;
            }
        }
     
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
}
