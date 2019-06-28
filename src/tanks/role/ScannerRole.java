package tanks.role;

import robocode.ScannedRobotEvent;

public interface ScannerRole {
    void turnRadarLeft(double degrees);
    void turnRadarRight(double degrees);
    void setAdjustRadarForRobotTurn(boolean newAdjustRadarForRobotTurn);
    void setAdjustRadarForGunTurn(boolean newAdjustRadarForGunTurn);
    void onScannedRobot(ScannedRobotEvent event);
    void scan();
}
