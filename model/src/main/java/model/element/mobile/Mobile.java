package model.element.mobile;

import contract.IMobile;
import model.element.Element;
import model.element.IBehavior;
import model.element.Permability;
import model.element.Sprite;

public abstract class Mobile extends Element implements IMobile, IBehavior  {
	public Mobile(final Sprite sprite, final Permability permability) {
		super(sprite,permability);
	}

	Mobile(final int x, final int y, final Sprite sprite, final Permability permability){
		this(sprite, permability);
		this.setX(x);
		this.setY(y);
	}
	private void setY(final int y) {

	}

	private void setX(final int x) {

	}
	@Override
	public void getBehavior() {

	}

}
