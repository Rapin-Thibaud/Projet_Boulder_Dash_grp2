package controller;

import java.util.ArrayList;
import java.util.Observable;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;
import entity.Position;

public class Controller implements IController, IModel {
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
    public int getElementOnTheMap(final int x, final int y) {
        return 0;
    }

    @Override
    public ArrayList<Position> getMap() {
        return null;
    }

    @Override
    public Observable getObservable() {
        return null;
    }

    @Override
    public void loadMap(final int id) {

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
            break;
        case NOTHING:
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
