package model.element.motionless;

import contract.IMotionless;
import contract.ISprite;
import contract.Permability;
import model.element.Element;

public class Motionless extends Element implements IMotionless {
	public Motionless(final ISprite sprite, final Permability permability) {
		super(sprite, permability);
	}
}
