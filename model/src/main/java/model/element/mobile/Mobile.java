package model.element.mobile;

import contract.IMobile;
import model.element.Permability;
import model.element.Sprite;

public class Mobile implements IMobile {
    public Mobile(final Sprite sprite, final Permability permability) {

    }

    public void getBehavior() {

    }
    private Boolean Penetrable(final IMobile mobile, final int x, final int y) {
        if (mobile.getMap().getXYElement(x, y).getPermeability() == Permability.PENETRABLE) {
            return true;
        } else {
            return false;
        }
    }
}