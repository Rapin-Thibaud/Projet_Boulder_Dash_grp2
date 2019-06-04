package model.element.mobile;


import contract.ISprite;
import contract.Permability;
import model.element.Sprite;


public class Ennemy extends Mobile{
	private static final ISprite sprite = new Sprite("2", "mob.png");
	private static Permability permability = Permability.BLOCKING;
	public Ennemy(final int x, final int y) {
		super(sprite, permability, x, y);
	}
	/*public void toMoveEnnemy(){
		final Random r = new Random();
		final int randMove = r.nextInt((4 - 1)+ 1)+ 1;

		switch(randMove){
		case 1 :
			if ((((getX())-1).getId == 2) || (((getX())-1).getId == 3) || (((getX())-1).getId == 4) || (((getX())-1).getId == 5) || (((getX())-1).getId == 6)){
				this.setX(x, y);
			}
			else{
				this.setX(x-1);
			}
		case 2 :
			if ((((getX())+1).getId == 2) || (((getX())+1).getId == 3) || (((getX())+1).getId == 4) || (((getX())+1).getId == 5) || (((getX())+1).getId == 6)){
				this.setX(x);
			}
			else{
				this.setX(x+1);
			}
		case 3 :
			if ((((getY())-1).getId == 2) || (((getY())-1).getId == 3) || (((getY())-1).getId == 4) || (((getY())-1).getId == 5) || (((getY())-1).getId == 6)){
				this.setY(y);
			}
			else{
				this.setY(y-1);
			}
		case 4 :
			if ((((getY())+1).getId == 2) || (((getY())+1).getId == 3) || (((getY())+1).getId == 4) || (((getY())+1).getId == 5) || (((getY())+1).getId == 6)){
				this.setY(y);
			}
			else{
				this.setY(y+1);
			}
		}
	 */}

