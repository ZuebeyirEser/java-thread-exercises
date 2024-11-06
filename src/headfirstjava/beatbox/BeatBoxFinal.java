package headfirstjava.beatbox;

import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.Track;
import javax.swing.*;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

public class BeatBoxFinal {
    private JList<String> incomingList;
    private JTextArea userMessage;
    private ArrayList<JCheckBox> checkboxList;
    private Vector<String> listVector = new Vector<>();
    private HashMap<String, boolean[]> otherSeqsMap = new HashMap<>();
    private String userName;
    private int nextNum;
    private ObjectOutputStream out;
    private ObjectInputStream in;
    private Sequencer sequencer;
    private Sequence sequence;
    private Track track;

}
