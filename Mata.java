package Mata;
import robocode.*;

public class mata extends Robot {
    public void run() {
        while (true) {
            turnGunLeft(360); 
          	
        }
    }

    public void 	onScannedRobot(ScannedRobotEvent e) {
   	turnGunLeft(10);
	fire(6);
	}

}
