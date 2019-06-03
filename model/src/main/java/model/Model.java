package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Observable;

import contract.IElement;
import contract.IModel;
import entity.Position;
import model.element.ElementFactory;


/**
 * The Class Model.
 *
 * @author Jean-Aymeric Diet
 */
public final class Model extends Observable implements IModel {

	private final ArrayList<Position> map;
	private final ArrayList<ArrayList<IElement>> maping;

	public Model() {
		this.map = new ArrayList<Position>();
		this.maping = new ArrayList<ArrayList<IElement>>();
	}


	@Override
	public Observable getObservable() {
		return this;
	}


	@Override
	public void loadMap(final int id) {
		try {
			final DAOPosition Position = new DAOPosition(DBConnection.getInstance().getConnection());
			this.setMaping(Position.find(id));
		} catch (final SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<ArrayList<IElement>> getMaping() {
		return this.maping;
	}

	public void setMaping(final ArrayList<Position> map) {
		this.maping.clear();
		final int[][] onTheMap = new int[28][25];
		for (final Position t : map) {
			onTheMap[t.getX()][t.getY()] = t.getid();
		}
		for (int x = 0 ; x < 27; x++) {
			final ArrayList<IElement> ligne = new ArrayList<IElement>();
			for ( int y = 0; y < 24; y ++) {
				ligne.add(y, ElementFactory.createElement(onTheMap[x][y]));
			}
			this.maping.add(x,ligne);
		}
		for(int x = 0 ; x < this.getMaping().size(); x++ ) {
			for (int y = 0 ; y < this.getMaping().get(x).size(); y++) {
				System.out.print(this.getMapingElement(x, y)+ " ");
			}
			System.out.println();
		}
		this.setChanged();
		this.notifyObservers();
	}

	@Override
	public IElement getMapingElement(final int x, final int y) {
		return this.maping.get(x).get(y);
	}

}
