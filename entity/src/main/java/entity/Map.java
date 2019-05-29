package entity;

import java.util.ArrayList;

public class Map extends Entity {
	private int id;
	private int width;
	private int height;
	private final ArrayList<FillingMap> toto;

	public Map() {
		this.height = 23;
		this.width = 26;
		this.toto = new ArrayList<FillingMap>();
	}

	public Map(final int height, final int width) {
		this.height = height;
		this.width = width;
		this.toto = new ArrayList<FillingMap>();
	}

	public int getId() {
		return this.id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public int getWidth() {
		return this.width;
	}

	public void fillToto(final FillingMap f) {
		this.toto.add(f);
	}

	public void setWidth(final int width) {
		this.width = width;
	}

	public int getHeight() {
		return this.height;
	}

	public void setHeight(final int height) {
		this.height = height;
	}
}
