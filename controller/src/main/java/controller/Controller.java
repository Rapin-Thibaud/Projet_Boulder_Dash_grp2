package controller;

import contract.ControllerOrder;
import contract.IController;
import contract.IMinor;
import contract.IMobile;
import contract.IModel;
import contract.IView;

public class Controller implements IController {
	private IView  view;
	private IModel model;
	private IMinor minor;
	IMobile mobile;
	public Controller(final IView view, final IModel model) {
		this.setView(view);
		this.setModel(model);
	}

	@Override
	public void control() {
		this.view.printMessage(
				"Appuyez sur les touches '1', '2', '3' ou '4' pour charger les differnets niveaux.");
	}

	@Override
	public void orderPerform(final ControllerOrder controllerOrder) {
		switch (controllerOrder) {
		case UP:
			this.model.loadMap(1);
			break;
		case DOWN:
			this.model.loadMap(2);
			break;
		case RIGHT:
			this.model.loadMap(3);
			break;
		case LEFT:
			this.model.loadMap(4);
			break;
		case Map1:
			this.model.loadMap(5);
			break;
		case MoveUp:
			this.minor.verifyAndMove(this.minor.getX(),(this.minor.getY() +1));
			break;
		case MoveDown:
			this.minor.verifyAndMove(this.minor.getX(), (this.minor.getY() -1));
			break;
		case MoveLeft:
			this.minor.verifyAndMove((this.minor.getX() -1), this.minor.getY());
			break;
		case MoveRight:
			this.minor.verifyAndMove((this.minor.getX()+ 1), this.minor.getY());
			break;
		default:
			this.model.loadMap(1);
			break;
		}
		this.minor = this.model.getMinor();
		System.out.println(this.minor.getX() + " " + this.minor.getY());
	}

	private void setModel(final IModel model) {
		this.model = model;
	}

	private void setView(final IView pview) {
		this.view = pview;

	}
}
