package controller;

import model.element.Behavior;
import model.element.mobile.Minor;

public class GameLoop {
	private static Boolean isRunning = true;
	static int i = 0;
	public static void loopGame() throws InterruptedException
    {
        while (getIsRunning()) {
            doGameUpdates();
            render();
            Thread.sleep(1000); //the timing mechanism
        }
    }

	private static void render() {
		if (Minor.getAlive() == true) {
            System.out.println(i);
        }		
	}

	private static void doGameUpdates() {
		 if (Minor.getAlive() == true){
	            Behavior.toMove();
	        }else {
	            setIsRunning(false);
	        }		
	}

	public static Boolean getIsRunning() {
		return isRunning;
	}

	public static void setIsRunning(Boolean isRunning) {
		GameLoop.isRunning = isRunning;
	}
		
}

