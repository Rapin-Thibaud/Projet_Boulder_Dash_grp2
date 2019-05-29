package model.element.motionless;

import model.element.Permability;
import model.element.Sprite;

public class Walls {
	private static final Sprite sprite = new Sprite('6', "WallBlock.png");

	public Walls() {
		super(sprite, Permability.BLOCKING);
	}
}
