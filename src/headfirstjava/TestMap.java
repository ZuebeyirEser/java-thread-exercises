package headfirstjava;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

import static java.lang.Math.PI;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();

        scores.put("Kathy", 42);
        scores.put("Bert", 343);
        scores.put("Skyler", 420);

        // immutable thread safe
        List<String> strings = List.of("somersault", "cassidy", "$10");
        // mutable tread safe
        List<String> mutableString = new CopyOnWriteArrayList<>();
        mutableString.add("sd");


        System.out.println(strings);



    }
}
