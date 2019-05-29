package model.element.mobile;

public class MobileFactory {
	private final Minor   minor   = new Minor();
	private final Rocks   rocks   = new Rocks();
	private final Ennemy  ennemy  = new Ennemy();
	private final Diamond diamond = new Diamond();

	public Mobile createDiamond() {
		return this.diamond;

	}

	public Mobile createEnnemy() {
		return this.ennemy;

	}

	public Mobile createMinor() {
		return this.minor;

	}

	public Mobile createRocks() {
		return this.rocks;

	}
}
