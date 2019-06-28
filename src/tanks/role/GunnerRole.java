package tanks.role;

import robocode.Bullet;
import robocode.BulletHitBulletEvent;
import robocode.BulletHitEvent;
import robocode.BulletMissedEvent;

public interface GunnerRole {
    void fire(double power);
    Bullet fireBullet(double power);
    double getEnergy();
    double getGunCoolingRate();
    double getGunHeading();
    double getGunHeat();
    void onBulletHit(BulletHitEvent event);
    void onBulletHitBullet(BulletHitBulletEvent event);
    void onBulletMissed(BulletMissedEvent event);
}
