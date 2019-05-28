package model.element.mobile;

import model.element.BehaviorType2;
import model.element.Sprite;

public class Rocks extends BehaviorType2 {
    private static final Sprite sprite = new Sprite();
    private int x, y;

    boolean toBePushable = true;

    Rocks(final int x, final int y){
        this.setX(x);
        this.setY(y);
    }

    public void toMoveRock() {
        if (this.toBePushable = true) {

        }
    }

    public Rocks() {
        this.toFall();
        this.toFallAndKill();
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