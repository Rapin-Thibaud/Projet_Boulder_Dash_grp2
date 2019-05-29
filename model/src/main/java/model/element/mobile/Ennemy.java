package model.element.mobile;

import model.element.BehaviorType1;
import model.element.Permability;
import model.element.Sprite;

public class Ennemy extends BehaviorType1{
	private static final Sprite sprite = new Sprite('2', "mob.png");
	private int x, y;

	public Ennemy() {
		this.toMove();
		this.toExplode();
		this.toDie();
	}
	Ennemy(final int x, final int y){
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
