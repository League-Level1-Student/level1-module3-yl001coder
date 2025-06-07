package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 600;
    static final int HEIGHT = 400;
    int x = 50;
    int y = 30;
    
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
    ellipse(x, y, width, height);
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
            }
            else if(keyCode == DOWN)
            {
                //Frog Y position goes down 
            }
            else if(keyCode == RIGHT)
            {
                //Frog X position goes right
            }
            else if(keyCode == LEFT)
            {
                //Frog X position goes left
            }
        }
    }
    void bounds() {
    	if(y > HEIGHT)
    	{
    		y = HEIGHT;
    	}
    	if(x > WIDTH)
    	{
    		x = WIDTH;
    
    	}
}
}
