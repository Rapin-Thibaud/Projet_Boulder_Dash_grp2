package model.element.mobile;

import java.awt.event.KeyEvent;

import contract.IMobile;
import contract.ISprite;
import contract.Permability;
import model.element.Sprite;

public class Minor extends Mobile{

	private static final ISprite sprite = new Sprite("1", "minor.png");
	private static Permability permability = Permability.BLOCKING;
	private boolean Penetrable;
	private int x, y;
	public int getX() {
		return this.x;
	}
	public void setX(final int x) {
		this.x = x;
	}
	public int getY() {
		return this.y;
	}
	public void setY(final int y) {
		this.y = y;
	}
	public Minor() {
		super(sprite, permability);
	}
	public void toMove(final IMobile mobile) {

		final int KeyPressed = 0;

		switch (KeyPressed) {
		case KeyEvent.VK_UP:
			this.verifyAndMove(this.x, this.y-1, mobile);
			break;
		case KeyEvent.VK_DOWN:
			this.verifyAndMove(this.x, this.y+1, mobile);
			break;
		case KeyEvent.VK_LEFT:
			this.verifyAndMove(this.x-1, this.y, mobile);
			break;
		case KeyEvent.VK_RIGHT:
			this.verifyAndMove(this.x+1, this.y, mobile);
			break;

		}
	}

	private void verifyAndMove(final int x, final int y, final IMobile mobile) {

		final int KeyPressed = 0;

		if (this.Penetrable = true) {
			switch (KeyPressed) {
			case KeyEvent.VK_UP:
				this.setY(y-1);
				break;
			case KeyEvent.VK_DOWN:
				this.setY(y+1);
				break;
			case KeyEvent.VK_LEFT:
				this.setX(x-1);
				break;
			case KeyEvent.VK_RIGHT:
				this.setX(x+1);
				break;

			}
		}
	}
}