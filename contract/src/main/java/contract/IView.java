package contract;

import java.util.ArrayList;

import entity.FillingMap;

/**
 * The Interface IView.
 *
 * @author Jean-Aymeric Diet
 */
public interface IView {

    void printMap(ArrayList<FillingMap> toto);

    /**
     * Prints the message.
     *
     * @param map
     *            the message
     */
    void printMap(String string);

}
