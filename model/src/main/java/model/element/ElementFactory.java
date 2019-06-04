package model.element;
import model.element.mobile.Diamond;
import model.element.mobile.Ennemy;
import model.element.mobile.Minor;
import model.element.mobile.Rocks;
import model.element.motionless.Ground;
import model.element.motionless.Motionless;
import model.element.motionless.Walls;

public class ElementFactory {

	public static Element createDiamond() {
		return new Diamond(0, 0);

	}

	public static Element createEnnemy() {
		return new Ennemy(0, 0);

	}

	public static Element createMinor() {
		return new Minor(2, 2);

	}

	public static Element createRocks() {
		return new Rocks(0, 0);

	}
	public static Motionless createWalls() {
		return new Walls();

	}
	public static Motionless createGround() {
		return new Ground();

	}

	public  static Element createElement(final int idElement) {
		switch(idElement) {
		case 1:
			return createMinor();
		case 2:
			return createEnnemy();
		case 3:
			return createRocks();
		case 4:
			return createDiamond();
		case 5:
			return createGround();
		case 6:
			return createWalls();
		default:
			return null;
		}
	}
}
