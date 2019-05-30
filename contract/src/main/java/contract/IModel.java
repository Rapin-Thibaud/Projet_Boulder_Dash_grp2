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

    /**
     * Gets the hello world.
     *
     * @return the helloworld entity
     */
    ArrayList<Position> getMap();

    /**
     * Gets the observable.
     *
     * @return the observable
     */
    Observable getObservable();

    /**
     * Load the message.
     *
     * @param elementChar
     *            the code
     */
    void loadMap(final int id);
}
