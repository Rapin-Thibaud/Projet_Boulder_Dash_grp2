package view;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Observable;

import javax.swing.SwingUtilities;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;
import entity.FillingMap;
import fr.exia.showboard.BoardFrame;

public final class View extends Observable implements IView, Runnable {

	private final ViewFrame viewFrame;

	public View(final IModel model) {
		this.viewFrame = new ViewFrame(model);
		SwingUtilities.invokeLater(this);
	}

	protected static ControllerOrder keyCodeToControllerOrder(final int keyCode) {
		switch (keyCode) {
		case KeyEvent.VK_UP:
			return ControllerOrder.UP;
		case KeyEvent.VK_DOWN:
			return ControllerOrder.DOWN;
		case KeyEvent.VK_RIGHT:
			return ControllerOrder.RIGHT;
		case KeyEvent.VK_LEFT:
			return ControllerOrder.LEFT;
		default:
			return ControllerOrder.NOTHING;
		}
	}

	public void printMap(final String message) {
		this.viewFrame.printMessage(message);
	}

	@Override
	public void run() {
		final BoardFrame frameAllView = new BoardFrame("All view");
		frameAllView.setDimension(new Dimension(width, height));
		frameAllView.setDisplayFrame(fullView);
		frameAllView.setLocation(frameCloseView.getX() + frameCloseView.getWidth() + widthBetweenFrame,
		        frameCloseView.getY());
		this.viewFrame.setVisible(true);
	}

	public void setController(final IController controller) {
		this.viewFrame.setController(controller);
	}

	@Override
	public void printMap(final ArrayList<FillingMap> toto) {
		// TODO Auto-generated method stub

	}
}
