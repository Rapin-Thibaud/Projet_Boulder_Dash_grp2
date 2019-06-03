package contract;

import java.util.ArrayList;
import java.util.Observable;

/**
 * The Interface IModel.
 *
 * @author Jean-Aymeric Diet
 */
public interface IModel {

	Observable getObservable();


	/**
	 * Load the message.
	 *
	 * @param elementChar
	 *            the code
	 */
	void loadMap(final int id);

	IElement getMapingElement(int x, int y);

	ArrayList<ArrayList<IElement>> getMaping();
}