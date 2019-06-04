package entity;


public class Position extends Entity  {
	private final int id;
	private int       x;
	private int       y;

	public Position() {
		this(0, 0, 0);
	}

	public Position(final int id, final int x, final int y) {
		this.id = id;
		this.x = x;
		this.y = y;
	}

	public int getid() {
		return this.id;
	}


	public int getX() {
		return this.x;
	}


	public int getY() {
		return this.y;
	}

	public void setX(final int x) {
		this.x = x;
	}

	public void setY(final int y) {
		this.y = y;
	}

}
