package tanks.crew;

import tanks.role.GunnerRole;

public abstract class Gunner {
    protected GunnerRole robot;
    protected Commander commander;
    Gunner(GunnerRole robot) {
        this.robot = robot;
    }

    void setCommander(Commander commander) {
        this.commander = commander;
    }
}
