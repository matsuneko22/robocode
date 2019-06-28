package tanks.crew;

import tanks.role.CommanderRole;

public abstract class Commander {
    protected CommanderRole robot;
    protected Driver driver;
    protected Gunner gunner;
    protected Scanner scanner;

    Commander(CommanderRole robot, Driver driver, Gunner gunner, Scanner scanner) {
        this.robot = robot;
        this.driver = driver;
        this.gunner = gunner;
        this.scanner = scanner;
    }
}
