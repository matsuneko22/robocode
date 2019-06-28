package tanks.role;

import robocode.HitRobotEvent;
import robocode.HitWallEvent;

public interface DriverRole {
    void ahead(double distance);
    void back(double distance);
    double getVelocity();
    void turnLeft(double degrees);
    void turnRight(double degrees);
    void onHitRobot(HitRobotEvent event);
    void onHitWall(HitWallEvent event);
    double getHeading();
    void turnGunLeft(double degrees);
    void turnGunRight(double degrees);
    void setAdjustRadarForGunTurn(boolean newAdjustRadarForGunTurn) ;
}
