package model.element.mobile;

import model.element.BehaviorType1;
import model.element.Permability;
import model.element.Sprite;

public class Minor extends BehaviorType1{
	private static final Sprite sprite = new Sprite('1', "minor.png");
	private int x, y;

	public Minor() {
		this.toMove();
		this.toExplode();
		this.toDie();
	}
	public void toMine() {

	}

	public void toPush() {

	}

	Minor(final int x, final int y){
		super(x, y, sprite, Permability.BLOCKING);
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
}
