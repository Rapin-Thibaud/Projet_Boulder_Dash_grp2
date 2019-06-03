package model.element.mobile;

import contract.ISprite;
import contract.Permability;
import model.element.Sprite;

public class Diamond extends Mobile{
	private static final ISprite sprite = new Sprite("4", "diamond.png");
	private static Permability permability = Permability.BLOCKING;

	public Diamond() {
		super(sprite, permability);
	}
}
