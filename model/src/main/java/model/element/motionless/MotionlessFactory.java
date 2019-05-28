package model.element.motionless;

public class MotionlessFactory {
    private final Ground     ground     = new Ground();
    private final Walls      walls      = new Walls();
    private final Background background = new Background();

    public Background createBackground() {
        return this.background;

    }

    public Ground createGround() {
        return this.ground;

    }

    public Walls createWalls() {
        return this.walls;

    }
}
