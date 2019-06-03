package model.element.mobile;

import contract.ISprite;
import contract.Permability;
import model.element.Sprite;

public class Rocks extends Mobile{
	private static final ISprite sprite = new Sprite("3", "rock.png");
	private static Permability permability = Permability.BLOCKING;
	public Rocks() {
		super(sprite, permability);
	}
}
