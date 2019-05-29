package entity;

public class FillingMap {
	private int id;
	private String elemChar;
	private int x;
	private int y;

	public FillingMap(final int id, final String elemChar, final int x, final int y) {
		this.id = id;
		this.elemChar = elemChar;
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

	public int getId() {
		return this.id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public String getElemChar() {
		return this.elemChar;
	}

	public void setElemChar(final String elemChar) {
		this.elemChar = elemChar;
	}
}
