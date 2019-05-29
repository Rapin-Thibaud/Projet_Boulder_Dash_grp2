package model.element.mobile;

import model.element.Permability;
import model.element.Sprite;

public class Minor extends Mobile{
	private static final Sprite sprite = new Sprite('1', "minor.png");

	Minor(final int x, final int y){
		super(x, y, sprite, Permability.BLOCKING);
	}

	public void toMove() {
		super.toMove();
	}

	public void toPush() {

	}

	public void toDie() {
		super.toDie();
	}

}
