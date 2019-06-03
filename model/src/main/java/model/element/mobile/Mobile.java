package model.element.mobile;

import contract.ISprite;
import contract.Permability;
import model.element.Element;

abstract class Mobile extends Element {

	public Mobile(final ISprite sprite, final Permability permability) {
		super(sprite, permability);
	}

}
