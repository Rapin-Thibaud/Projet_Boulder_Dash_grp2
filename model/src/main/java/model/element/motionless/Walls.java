package model.element.motionless;


import contract.ISprite;
import contract.Permability;
import model.element.Sprite;


public class Walls extends Motionless{
	private static final ISprite sprite = new Sprite("6", "WallBlock.png");
	private static Permability permability = Permability.BLOCKING;
	public Walls() {
		super(sprite,permability);
	}
}
