package controller;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;

public class Controller implements IController {
	private IView  view;
	private IModel model;

	public Controller(final IView view, final IModel model) {
		this.setView(view);
		this.setModel(model);
	}

	@Override
	public void control() {
		this.view.printMessage(
				"Appuyez sur les touches '↑', '↓', '→' ou '←' pour se déplacer et ramassez assez de diamants pour finir le niveau.");
	}

	@Override
	public void orderPerform(final ControllerOrder controllerOrder) {
		switch (controllerOrder) {
		case UP:
			break;
		case DOWN:
			break;
		case RIGHT:
			break;
		case LEFT:
			this.model.loadMap(2);
			break;
		case Map1:
			this.model.loadMap(1);
			break;
		default:
			this.model.loadMap(1);
			break;
		}
	}

	private void setModel(final IModel model) {
		this.model = model;
	}

	private void setView(final IView pview) {
		this.view = pview;

	}
}
