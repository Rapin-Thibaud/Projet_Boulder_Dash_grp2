package model.element.mobile;

import model.element.Permability;
import model.element.Sprite;

public class Rocks extends Mobile {
	private static final Sprite sprite = new Sprite('3', "rock.png");

	boolean toBePushable = true;

	Rocks(final int x, final int y){
		super(x,y, sprite, Permability.BLOCKING);
		this.setY(x);
		this.setY(y);
	}

	public void toMoveRock() {
		if (this.toBePushable = true) {

		}
	}

	public Rocks() {
		this.toFall();
		this.toFallAndKill();
	}
}
