package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Observable;

import contract.IModel;
import entity.Position;

/**
 * The Class Model.
 *
 * @author Jean-Aymeric Diet
 */
public final class Model extends Observable implements IModel {

    private ArrayList<Position> map;
    private final int[][]       onTheMap;

    public Model() {
        this.map = new ArrayList<Position>();
        this.onTheMap = new int[27][24];
    }

    @Override
    public int getElementOnTheMap(final int x, final int y) {
        return this.onTheMap[x][y];
    }

    @Override
    public ArrayList<Position> getMap() {
        return this.map;
    }

    @Override
    public Observable getObservable() {
        return this;
    }

    public int[][] getOnTheMap() {
        return this.onTheMap;
    }

    @Override
    public void loadMap(final int id) {
        try {
            final DAOPosition Position = new DAOPosition(DBConnection.getInstance().getConnection());
            this.setMap(Position.find(id));
            this.setOnTheMap(this.getMap());
        } catch (final SQLException e) {
            e.printStackTrace();
        }
    }

    private void setMap(final ArrayList<Position> map) {
        this.map = map;
    }

    public void setOnTheMap(final ArrayList<Position> map) {
        for (final Position t : map) {
            this.onTheMap[t.getX()][t.getY()] = t.getid();
        }
        this.setChanged();
        this.notifyObservers();
    }

}
