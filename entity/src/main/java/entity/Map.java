
package entity;

public class Map extends Entity {

    /** The id. */
    private int    id;

    /** The key. */
    private String key;

    /** The message. */
    private String message;

    /**
     * Instantiates a new hello world.
     */
    public Map() {
        this(0, "", "");
    }

    /**
     * Instantiates a new hello world.
     *
     * @param id
     *            the id
     * @param key
     *            the key
     * @param message
     *            the message
     */
    public Map(final int id, final String key, final String message) {
        this.setId(id);
        this.setKey(key);
        this.setMessage(message);
    }

    /**
     * Gets the id.
     *
     * @return the id
     */
    public int getId() {
        return this.id;
    }

    /**
     * Gets the key.
     *
     * @return the key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * Gets the message.
     *
     * @return the message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Sets the id.
     *
     * @param id
     *            the new id
     */
    public void setId(final int id) {
        this.id = id;
    }

    /**
     * Sets the key.
     *
     * @param key
     *            the new key
     */
    public void setKey(final String key) {
        this.key = key;
    }

    /**
     * Sets the message.
     *
     * @param message
     *            the new message
     */
    public void setMessage(final String message) {
        this.message = message;
    }

}
=======
package entity;

public class Map {
	private int id;
	private String label;
	private int width;
	private int height;

	public Map(final int id, final String label, final int width, final int height) {
		this.setId(id);
		this.setLabel(label);
		this.setWidth(width);
		this.setHeight(height);
	}

	public Map() {

	}

	public int getId() {
		return this.id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(final String label) {
		this.label = label;
	}

	public int getWidth() {
		return this.width;
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

