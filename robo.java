package robo;
import robocode.*;

public class Ctrl extends Robot {
    public void run() {
        while (true) {
            ahead(100);
            turnLeft(90);
        }
    }
}
