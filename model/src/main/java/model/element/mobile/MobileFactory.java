package model.element.mobile;

public class MobileFactory {
	int x;
	int y;

	private final Minor   minor   = new Minor();
	private final Rocks   rocks   = new Rocks(this.x,this.y);
	private final Ennemy  ennemy  = new Ennemy(this.x, this.y);
	private final Diamond diamond = new Diamond();

	public Mobile createDiamond(final int x, final int y) {
		return new Diamond(x, y);

	}

	public Mobile createEnnemy(final int x, final int y) {
		return new Ennemy(x, y);

	}

	public Mobile createMinor() {
		return new Minor(this.x, this.y);

	}

	public Mobile createRocks() {
		return new Rocks(this.x,this.y);

	}
}
