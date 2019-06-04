package model.element;

public class BehaviorType2 extends Behavior{

	public void toFall() {
		if (((getY()) -1) == null) {
			setY(y -1);
		}
		else if(((((getY())-1) =='3') || (((getY())-1) == "4")) && (((getX())-1) == null) && ((((getX()) -1) && ((getY())-1)) == null)) {
			setX(x -1) ;
			SetY(y -1);
			return setX(), setY();
		}
		else if(((((getY())-1) =='3') || (((getY())-1) == "4")) && (((getX())+1) == null) && ((((getX()) +1) && ((getY())-1)) == null)) {
			setX(x +1);
			setY(y +1);
			return setX(), setY();
		}
	}

	public void toFallAndKill() {

	}

}
