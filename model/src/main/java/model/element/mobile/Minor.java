package model.element.mobile;

import java.awt.event.KeyEvent;

import model.element.BehaviorType1;
import model.element.Sprite;

public class Minor extends BehaviorType1{
   
	@SuppressWarnings("unused")
	private static final Sprite sprite = new Sprite();
    private int x, y;
    
     Minor(final int x, final int y){
        this.setX(x);
        this.setY(y);
    }
     
    public void toMove() {
    	
    	  switch (event.KeyPressed) {
    	  case KeyEvent.VK_UP:
    	    this.setY(y-1); 
    	    break;
    	  case KeyEvent.VK_DOWN:
    	    this.setY(y+1); 
    	    break;
    	  case KeyEvent.VK_LEFT:
    	    this.setX(x-1); 
    	    break;
    	  case KeyEvent.VK_RIGHT:
    	    this.setX(x+1);
    	    break;
    	  
    	}
    }
    
    public static boolean getAlive() {
    	return true;
    }

    public Minor() {
        this.toExplode();
        this.toDie();
    }
    public void toMine() {

    }

    public void toPush() {

    }

   
    public int getX() {
        return this.x;
    }

    public void setX(final int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(final int y) {
        this.y = y;
    }
}