    package headfirstjava.serialization;

    import java.io.Serializable;

    public class GameChar implements Serializable {
        static final long serialVersionUID = 1L;
        private int power;
        private String type;
        Weapon[] weapons;
        public GameChar(int power, String type, Weapon[] weapons) {
            this.power = power;
            this.type = type;
            this.weapons = weapons;
        }


        public String getType() {
            return type;
        }
    }
