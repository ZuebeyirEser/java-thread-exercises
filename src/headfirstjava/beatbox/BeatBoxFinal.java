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
    String[] instrumentNames = {"Bass Drum", "Closed Hi-Hat",
            "Open Hi-Hat", "Acoustic Snare", "Crash Cymbal", "Hand Clap",
            "High Tom", "Hi Bongo", "Maracas", "Whistle", "Low Conga",
            "Cowbell", "Vibraslap", "Low-mid Tom", "High Agogo",
            "Open Hi Conga"};
    int[] instruments = {35, 42, 46, 38, 49, 39, 50, 60, 70, 72, 64, 56, 58, 47, 67, 63};


}
