package model.element.mobile;


import java.awt.event.KeyEvent;

import contract.IMinor;
import contract.IMobile;
import contract.IModel;
import contract.ISprite;
import contract.Permability;
import model.element.Sprite;

public class Minor extends Mobile implements IMinor{
	IModel model;
	private static final ISprite sprite = new Sprite("1", "minor.png");
	private static Permability permability = Permability.BLOCKING;
	private boolean Penetrable;


	public Minor(final int x, final int y) {
		super(sprite, permability, x, y);
	}
	public void toMove(final IMobile mobile) {
		final int KeyPressed = 0;

		switch (KeyPressed) {
		case KeyEvent.VK_UP:
			this.verifyAndMove(this.getX(),(this.getY() +1));
			break;
		case KeyEvent.VK_DOWN:
			this.verifyAndMove(this.getX(), (this.getY() -1));
			break;
		case KeyEvent.VK_LEFT:
			this.verifyAndMove((this.getX() -1), this.getY());
			break;
		case KeyEvent.VK_RIGHT:
			this.verifyAndMove((this.getX()+ 1), this.getY());
			break;

		}
	}

	@Override
	public void verifyAndMove(final int x, final int y) {

		final int KeyPressed = 0;

		if (this.Penetrable = true) {
			switch (KeyPressed) {
			case KeyEvent.VK_UP:
				this.setY(y-1);
				this.model.refresh();
				break;
			case KeyEvent.VK_DOWN:
				this.setY(y+1);
				this.model.refresh();
				break;
			case KeyEvent.VK_LEFT:
				this.setX(x-1);
				this.model.refresh();
				break;
			case KeyEvent.VK_RIGHT:
				this.setX(x+1);
				this.model.refresh();
				break;

			}
		}
	}

}


