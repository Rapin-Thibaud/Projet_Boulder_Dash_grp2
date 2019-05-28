package entity;

public class FillingMap {
	private final int id;
	private int x;
	private int y;

	public FillingMap(final int id, final int x, final int y) {
		this.id = id;
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public void setX(final int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(final int y) {
		this.y = y;
	}
}
