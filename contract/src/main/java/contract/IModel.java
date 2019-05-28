package contract;

import java.util.Observable;

import entity.Map;

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
	Map getMap();

	/**
	 * Load the message.
	 *
	 * @param elementChar
	 *          the code
	 */
	void loadObject(String elementChar);

	/**
	 * Gets the observable.
	 *
	 * @return the observable
	 */
	Observable getObservable();
}
