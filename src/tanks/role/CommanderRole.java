package tanks.role;

public interface CommanderRole {
    double getBattleFieldHeight();
    double getBattleFieldWidth();
    double getHeight();
    double getWidth();
    double getX();
    double getY();
    double getEnergy();
    void doNothing();
    void stop();
    void stop(boolean overwrite);
    void resume();
}
