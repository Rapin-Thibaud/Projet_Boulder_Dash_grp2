package model.element.mobile;

import java.awt.event.KeyEvent;

import contract.IMobile;
import model.element.BehaviorType1;
import model.element.Permability;
import model.element.Sprite;

public class Minor extends BehaviorType1{
   
	@SuppressWarnings("unused")
	private static final Sprite sprite = new Sprite();
    private int x, y;
	private boolean Penetrable;
    
     Minor(final int x, final int y){
        this.setX(x);
        this.setY(y);
    }
     
     
    public void toMove(final IMobile mobile) {
    	
    	  switch (event.KeyPressed) {
    	  case KeyEvent.VK_UP:
    		this.verifyAndMove(x, y-1, mobile); 
    	    break;
    	  case KeyEvent.VK_DOWN:
    	    this.verifyAndMove(x, y+1, mobile); 
    	    break;
    	  case KeyEvent.VK_LEFT:
    	    this.verifyAndMove(x-1, y, mobile); 
    	    break;
    	  case KeyEvent.VK_RIGHT:
    	    this.verifyAndMove(x+1, y, mobile);
    	    break;
    	  
    	}
    }
    
    private void verifyAndMove(final int x, final int y, final IMobile mobile) {
        if (this.Penetrable = true) {
        	switch (event.KeyPressed) {
      	  case KeyEvent.VK_UP:
      	    this.setY(y-1); 
      	    break;
      	  case KeyEvent.VK_DOWN:
      	    this.setY(y+1); 
      	    break;
      	  case KeyEvent.VK_LEFT:
      	    this.setX(x-1); 
      	    break;
      	  case KeyEvent.VK_RIGHT:
      	    this.setX(x+1);
      	    break;
      	  
      	}
        } else if (this.Rocks()) {
            ((Minor) mobile).toPush((Rocks) mobile.getMap().getX(x) mobile.getMap().getY(y));
        } else if (this.Diamond(IMobile, x, y)) {
            ((Minor) mobile).pickupDiamond((Diamond) mobile.getMap().getXYElement(x, y));
            this.moveAtXY(mobile, x, y);
        } else if (this.Ground(IMobile, x, y)) {
            ((Minor) mobile).digTunnel(x, y);
            this.moveAtXY(mobile, x, y);
        } else if (this.isOpenableAndOpen(mobile, x, y)) {
            this.moveAtXY(mobile, x, y);
            mobile.getMap().setWin(true);
        }
    public static boolean getAlive() {
    	return true;
    }

    public Minor() {
        this.toExplode();
        this.toDie();
    }
    public void toMine(IMobile mobile) {
    	if (this.Ground(IMobile, x, y)) {
            return Hole;
    }
   }

    public void toPush(final Rocks rock) {
    	
            final int xPlayer = this.getX();
            final int yPlayer = this.getY();
            final int xRock = rock.getX();
            final int yRock = rock.getY();
            if ((xRock == (xPlayer + 1)) && (yRock == yPlayer)) {
                this.verifyAndPushForRockPushing(xRock + 1, yRock, rock);
            } else if ((xRock == (xPlayer - 1)) && (yRock == yPlayer)) {
                this.verifyAndPushForRockPushing(xRock - 1, yRock, rock);
            } else if ((yRock == (yPlayer - 1)) && (xRock == xPlayer)) {
                this.verifyAndPushForRockPushing(xRock, yRock - 1, rock);
            } else if ((yRock == (yPlayer + 1)) && (xRock == xPlayer)) {
                this.verifyAndPushForRockPushing(xRock, yRock + 1, rock);
            }
        
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
     private void verifyAndPushForRockPushing(final int x, final int y, final Rocks rock) {
        if (this.getX(x).getY(y).getPermability() == Permability.PENETRABLE) {
            this.getMap().setXYElement(rock.getX(), rock.getY());
            rock.setX(x);
            rock.setY(y);
            this.getMap().setXYElement(x, y, rock);
        }
    }
}