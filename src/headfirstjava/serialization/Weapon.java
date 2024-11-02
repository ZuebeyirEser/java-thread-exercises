package headfirstjava.serialization;

import java.io.Serializable;

public class Weapon implements Serializable {
    private final String nameOftheWeapon;

    public Weapon(String nameOftheWeapon) {
        this.nameOftheWeapon = nameOftheWeapon;
    }
    public String getWeaponType() {
        return nameOftheWeapon;
    }
}
