package model.element.motionless;

import contract.ISprite;
import contract.Permability;
import model.element.Sprite;

public class Ground extends Motionless {
	private static final ISprite sprite = new Sprite("5", "dirt.png");
	private static Permability permability = Permability.BLOCKING;
	public Ground() {
		super(sprite,permability);
	}
}
