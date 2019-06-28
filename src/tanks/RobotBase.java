package tanks;

import tanks.crew.Commander;
import tanks.crew.Driver;
import tanks.crew.Gunner;
import tanks.crew.Scanner;
import robocode.TeamRobot;
import tanks.role.CommanderRole;
import tanks.role.DriverRole;
import tanks.role.GunnerRole;
import tanks.role.ScannerRole;

public abstract class RobotBase extends TeamRobot implements DriverRole, GunnerRole, ScannerRole, CommanderRole {
    protected Gunner gunner;
    protected Scanner scanner;
    protected Commander commander;
    protected Driver driver;
    public abstract void initTank();
    public RobotBase () {
        this.initTank();
    }
}
