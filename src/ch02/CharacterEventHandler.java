package ch02;

import java.util.Vector;

public class CharacterEventHandler {
    private Vector listeners = new Vector();

    public void addCharacterListener(CharacterListener cl) {
        listeners.add(cl);
    }
    public void removeCharacterListener(CharacterListener cl) {
        listeners.remove(cl);
    }
    public void fireNewCharacter(CharacterSource source, int c) {
        CharacterEvent ce = new CharacterEvent(source, c);
        CharacterListener[] cl = (CharacterListener[] ) listeners.toArray(new CharacterListener[0]);
        for (CharacterListener characterListener : cl) {
            characterListener.newCharacter(ce);
        }
    }
}
