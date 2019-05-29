package model.element.mobile;

import model.element.BehaviorType2;
import model.element.Permability;
import model.element.Sprite;

public class Diamond extends BehaviorType2{
	private static final Sprite sprite = new Sprite('4', "diamond.png");
	private int x, y;

	Diamond(final int x, final int y){
		super(x, y, sprite, Permability.BLOCKING);
		this.setX(x);
		this.setY(y);
	}

	public Diamond() {
		this.toFall();
		this.toFallAndKill();
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


