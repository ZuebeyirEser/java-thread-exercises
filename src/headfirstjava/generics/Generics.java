package headfirstjava.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Generics {
    public static void main(String[] args) {
        // generics enables types to be parameters when defining classes interface and methods
        List list = new ArrayList();
        list.add("hello");
        String s = (String) list.get(0);

        // no need casting
        List<String> listTwo = new ArrayList<>();
        listTwo.add("hello");
        String s2 = listTwo.get(0);

        // invoking and instanciating generic type
        Box<Integer> integerBox;
        integerBox = new Box<Integer>();
        List<String> list3 = new ArrayList<>();


    }
}
