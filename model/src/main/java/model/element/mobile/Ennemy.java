package model.element.mobile;

import model.element.Permability;
import model.element.Sprite;

public class Ennemy extends Mobile{
	private static final Sprite sprite = new Sprite('2', "mob.png");

	Ennemy(final int x, final int y){
		super(x, y, sprite, Permability.BLOCKING);
	}
	public void toDie() {
		super.toDie();
	}

	public void toMove() {
		super.toMove();
	}
}
