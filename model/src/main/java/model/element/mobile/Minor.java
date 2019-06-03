package model.element.mobile;

import contract.ISprite;
import contract.Permability;
import model.element.Sprite;

public class Minor extends Mobile{

	private static final ISprite sprite = new Sprite("1", "minor.png");
	private static Permability permability = Permability.BLOCKING;
	public Minor() {
		super(sprite, permability);
	}
}