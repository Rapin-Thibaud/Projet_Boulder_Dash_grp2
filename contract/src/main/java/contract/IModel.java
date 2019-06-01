package contract;

import java.util.ArrayList;
import java.util.Observable;

import entity.Position;

/**
 * The Interface IModel.
 *
 * @author Jean-Aymeric Diet
 */
public interface IModel {
    int getElementOnTheMap(int x, int y);

    ArrayList<Position> getMap();

    Observable getObservable();

    int[][] getOnTheMap();

    /**
     * Load the message.
     *
     * @param elementChar
     *            the code
     */
    void loadMap(final int id);
}