package controller;

import java.util.ArrayList;
import java.util.Observable;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;
import entity.Position;

/**
 * The Class Controller.
 */
public final class Controller implements IController, IModel {

    /** The view. */
    private IView  view;

    /** The model. */
    private IModel model;

    /**
     * Instantiates a new controller.
     *
     * @param view
     *            the view
     * @param model
     *            the model
     */
    public Controller(final IView view, final IModel model) {
        this.setView(view);
        this.setModel(model);
    }

    /**
     * Control.
     */
    /*
     * (non-Javadoc)
     *
     * @see contract.IController#control()
     */
    @Override
    public void control() {
        this.view.printMap(
                "Appuyez sur les touches '↑', '↓', '→' ou '←' pour se déplacer et ramassez assez de diamants pour finir le niveau.");
    }

    @Override
    public int getElementOnTheMap(final int x, final int y) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public ArrayList<Position> getMap() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Observable getObservable() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void loadMap(final int id) {
        // TODO Auto-generated method stub

    }

    /**
     * Order perform.
     *
     * @param controllerOrder
     *            the controller order
     */
    /*
     * (non-Javadoc)
     *
     * @see contract.IController#orderPerform(contract.ControllerOrder)
     */
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
            break;
        case NOTHING:
            this.model.loadMap(1);
            break;
        default:
            this.model.loadMap(1);
            break;
        }
    }

    /**
     * Sets the model.
     *
     * @param model
     *            the new model
     */
    private void setModel(final IModel model) {
        this.model = model;
    }

    /**
     * Sets the view.
     *
     * @param pview
     *            the new view
     */
    private void setView(final IView pview) {
        this.view = pview;
    }

}
