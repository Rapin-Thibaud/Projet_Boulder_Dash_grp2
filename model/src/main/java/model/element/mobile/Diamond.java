package model.element.mobile;

import model.element.BehaviorType2;
import model.element.Sprite;

public class Diamond extends BehaviorType2{
    @SuppressWarnings("unused")
	private static final Sprite sprite = new Sprite();
	private int x, y;

	boolean toBePickable = true;
	
	public void toPickDiamond() {
        if (this.toBePickable = true) {

        }
	}
    
    Diamond(final int x, final int y){
        this.setX(x);
        this.setY(y);
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
	public Diamond() {
    	this.toFall();
        this.toFallAndKill();
    }
}
