package model.element.mobile;

import contract.IMobile;
import model.element.Sprite;

public class Minor(
final int x,
final int     y,
final IMobile mobile)
{
    private static final Sprite sprite = new Sprite();

    public Minor() {

    @Override
    public final void moveLeft() {
        super.moveLeft();
    }

    @Override
    public final void moveRight() {
        super.moveRight();
    }

    @Override
    public final void moveUp() {
        super.moveUp();
    }

    @Override
    public final void moveDown() {
        super.moveDown();
    }

    @Override
    protected final void die() {
        super.die();
        this.setSprite(spriteExplode);
    }
}