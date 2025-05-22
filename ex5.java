package robo;
import robocode.*;

public class Ctrl extends Robot {
    public void run() {
        while (true) {
            ahead(800); 
            turnLeft(90); 
        }
    }

    public void onHitWall(HitWallEvent e) {
        setDebugProperty("identificador", String.valueOf(e.getBearing()));
       degrees = 90 - (e.getBearing());
	   
		turnLeft(e.getBearing));
    }
}
