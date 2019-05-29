package model.element;

public abstract class Element implements IElement {
	private Sprite sprite;
	private Permability permability;

	@Override
	public Sprite getSprite() {
		return this.sprite;
	}

	public void setSprite(final Sprite sprite) {
		this.sprite = sprite;
	}

	public Permability getPermability() {
		return this.permability;
	}

	public void setPermability(final Permability permability) {
		this.permability = permability;
	}


	public Element(final Sprite sprite, final Permability permability) {
		this.setSprite(sprite);
		this.setPermability(permability);
	}

}
