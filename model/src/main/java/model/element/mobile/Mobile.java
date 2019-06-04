package model.element.mobile;

import contract.ISprite;
import contract.Permability;
import model.element.Element;

abstract class Mobile extends Element {
	private int x;

	private int y;
	public Mobile(final ISprite sprite, final Permability permability, final int x, final int y) {
		super(sprite, permability );
		this.x = x;
		this.y = y;
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

