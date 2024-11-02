package headfirstjava.serialization;

import java.io.*;

public class GameTest implements Serializable {
    public static void main(String[] args) {
        Weapon[] weapons = { new Weapon("AK47"), new Weapon("Sniper"), new Weapon("Pistol") };
        GameChar character = new GameChar(50, "Soldier", weapons);
        GameChar characterTwo = new GameChar(50, "Elf", weapons);
        GameChar characterThree = new GameChar(50, "Troll", weapons);
        // serialization
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("MyGame.ser");
            ObjectOutputStream os = new ObjectOutputStream(fileOutputStream);
            os.writeObject(character);
            os.writeObject(characterTwo);
            os.writeObject(characterThree);
            os.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        // deserialization
        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("MyGame.ser"));
            GameChar characterRestore = (GameChar) is.readObject();
            GameChar characterTwoRestore = (GameChar) is.readObject();
            GameChar characterThreeRestore = (GameChar) is.readObject();
            System.out.println("character's type: " + characterRestore.getType());
            System.out.println("characterTwo's type: " + characterTwoRestore.getType());
            System.out.println("characterThree's type: " + characterThreeRestore.getType());

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
