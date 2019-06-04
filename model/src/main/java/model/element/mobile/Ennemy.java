package model.element.mobile;

import contract.ISprite;
import contract.Permability;
import model.element.Sprite;


public class Ennemy extends Mobile {
	private static final ISprite sprite = new Sprite("2", "mob.png");
	private static Permability permability = Permability.BLOCKING;
	public Ennemy() {
		super(sprite, permability);
	}
}