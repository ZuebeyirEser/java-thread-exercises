package headfirstjava;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaTest {
    public static void main(String[] args) {
        List<String> allColors = List.of("Red", "Blue","blue", "Yellow","Black","Purple","Green");
        //Stream<String> stream = allColors.stream();
        /*
        * As we can see below limit is returning java.util.stream.SliceOps$1@4617c264
        * Stream method that return another stream is called intermediate operation
        * limit is intermediate operation
         * */
        //Stream<String> limit = stream.limit(3);
        //System.out.println(limit);

        // if we would like to do something about it we need to user Terminal operation
        //long numberOfColorsThatAreLimitedByLimit = limit.count();
        //System.out.println(numberOfColorsThatAreLimitedByLimit);
        // one of the common way what to do Stream is putting results into another type of collection

        /*Note that once terminal opration has been implemented we cannot */
        //List<String> result = limit.collect(Collectors.toList());
        //System.out.println("result = " + result);
        // BUILDING BLOCK CAN BE STACKED AND COMBINED
        List<String> stream = allColors.stream()
                .sorted((s1,s2)->s1.compareToIgnoreCase(s2))
                .limit(3)
                .skip(2)
                .collect(Collectors.toList());
        System.out.println(stream);
        String s1 = "ss";
        String s2 = "sss";


        Comparator<String> comparator = (one,two) -> {
            return one.compareTo(two);
        };

        allColors.forEach(str -> {
            String output = "str = " + str;
            System.out.println(output);
        });

        Runnable r = () -> System.out.println("Hi!");
        r.run();

        Consumer<String> c = s -> System.out.println(s);
        allColors.forEach(c);

        List<Song> songs = new Songs().getSongs();
        List<Song> rockSongs = songs.stream()
                .filter(song -> song.getGenre().equals("Rock"))
                .collect(Collectors.toList());
        System.out.println(rockSongs);

        List<Song> someGenreOfRock = songs.stream()
                .filter(song -> song.getGenre().contains("Rock"))
                .collect(Collectors.toList());
        System.out.println(someGenreOfRock);

        List<Song> beatlesSong = songs.stream()
                .filter(song -> song.getArtist().equals("The Beatles"))
                .collect(Collectors.toList());
        System.out.println(beatlesSong);
        // get the genres
        List<String> genre = songs.stream()
                .map(song -> song.getGenre())
                .collect(Collectors.toList());
        System.out.println(genre);

        // get the genres
        List<String> distinctGenre = songs.stream()
                .map(song -> song.getGenre())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinctGenre);

        Optional<Song> year1922 = songs.stream()
                .filter(song -> song.getYear() > 2100)
                .findFirst();
        System.out.println(year1922);


    }
}
