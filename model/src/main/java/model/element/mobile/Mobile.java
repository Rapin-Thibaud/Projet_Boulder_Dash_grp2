package model.element.mobile;

import contract.IMobile;
import model.element.Element;
import model.element.Permability;
import model.element.Sprite;

public abstract class Mobile extends Element implements IMobile  {
	public Mobile(final Sprite sprite, final Permability permability) {
		super(sprite,permability);
	}
	private int x, y;

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

	@Override
	public void getBehavior() {

	}

}
