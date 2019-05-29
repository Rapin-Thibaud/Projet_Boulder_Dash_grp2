package model.element.mobile;

import model.element.Permability;
import model.element.Sprite;

public class Diamond extends Mobile{
	private static final Sprite sprite = new Sprite('4', "diamond.png");

	Diamond(final int x, final int y){
		super(x, y, sprite, Permability.BLOCKING);
	}

	@Override
	public void toFallDown() {
		super.toFallDown();
	}

	@Override
	public void toFallDownLeft() {
		super.toFallDownLeft();
	}

	@Override
	public void toFallDownRight() {
		super.toFallDownRight();
	}

	@Override
	public Permability getPermeability() {
		// TODO Auto-generated method stub
		return null;
	}
}


