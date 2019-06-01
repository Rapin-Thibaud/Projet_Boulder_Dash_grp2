package model.element;

public abstract class Element implements IElement {

    private Sprite      sprite;
    private Permability permability;

    public Element(final Sprite sprite, final Permability permability) {
        this.setSprite(sprite);
        this.setPermability(permability);
    }

    @Override
    public Permability getPermability() {
        return this.permability;
    }

    @Override
    public Sprite getSprite() {
        return this.sprite;
    }

    public void setPermability(final Permability permability) {
        this.permability = permability;
    }

    public void setSprite(final Sprite sprite) {
        this.sprite = sprite;
    }

}
