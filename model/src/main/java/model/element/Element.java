package model.element;

import contract.IElement;
import contract.ISprite;
import contract.Permability;

public abstract class Element implements IElement {

    private ISprite      sprite;
    private Permability permability;

    public Element(final ISprite sprite, final Permability permability) {
        this.setSprite(sprite);
        this.setPermability(permability);
    }

    @Override
    public Permability getPermability() {
        return this.permability;
    }

    @Override
    public ISprite getSprite() {
        return this.sprite;
    }

    public void setPermability(final Permability permability) {
        this.permability = permability;
    }

    public void setSprite(final ISprite sprite) {
        this.sprite = sprite;
    }

}
