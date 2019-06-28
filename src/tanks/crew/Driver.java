package tanks.crew;

import tanks.role.DriverRole;

public abstract class Driver {
    protected DriverRole robot;
    protected Commander commander;
    Driver(DriverRole robot) {
        this.robot = robot;
    }

    void setCommander(Commander commander) {
        this.commander = commander;
    }
}
