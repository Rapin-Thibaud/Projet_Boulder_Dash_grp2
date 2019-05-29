package model.element;

import contract.IMobile;

public class BehaviorType1 {
    public void toDie() {

    }

    public void toExplode() {

    }

    public void toMove() {
        @Override
        public void moveUp() {
            this.setY(this.getY() - 1);
        }
        @Override
        public void moveLeft() {
            this.setX(this.getX() - 1);
        }

        @Override
        public void moveDown() {
            this.setY(this.getY() + 1);
        }

        @Override
        public void moveRight() {
            this.setX(this.getX() + 1);
        }
    }
}
