package tanks.crew;

import tanks.role.ScannerRole;

public abstract class Scanner {
    protected ScannerRole robot;
    protected Commander commander;
    Scanner(ScannerRole robot) {
        this.robot = robot;
    }

    void setCommander(Commander commander) {
        this.commander = commander;
    }
}
