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
    double degrees = 90 - e.getBearing();
    setDebugProperty("identificador", String.valueOf(e.getBearing()));
    turnLeft(degrees);
	}

}
