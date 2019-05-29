package contract;

import java.util.Observable;

/**
 * The Interface IModel.
 *
 * @author Jean-Aymeric Diet
 */
public interface IModel {

    /**
     * Gets the hello world.
     *
     * @return the helloworld entity
     */
    String getMap();

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
    void loadObject(String elementChar);
}
