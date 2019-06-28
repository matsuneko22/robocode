package tanks;

import tanks.crew.Hana;
import tanks.crew.Mako;
import tanks.crew.Miho;
import tanks.crew.Yukari;
import robocode.*;

public class Crusader extends RobotBase {
    public void initTank() {
        this.gunner = new Hana(this);
        this.scanner = new Yukari(this);
        this.driver = new Mako(this);
        this.commander = new Miho(this, this.driver, this.gunner, this.scanner);
    }
    public void run() {
        while(true) {
            ahead(100);
            turnGunLeft(90);
            back(10);
            turnGunRight(90);
        }
    }

    public void onScannedRobot(ScannedRobotEvent e) {
        fire(1);
    }
}
