package model.element.motionless;

import model.element.Permability;
import model.element.Sprite;

public class Ground {
	private static final Sprite sprite = new Sprite('5', "dirt.png");

	public Ground() {
		super(sprite, Permability.BLOCKING);
	}
}
