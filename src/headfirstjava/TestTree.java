package headfirstjava;

import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

public class TestTree {
    public static void main(String[] args) {
        Book b1 = new Book("Book 1");
        Book b2 = new Book("Book 2");
        Book b3 = new Book("Book 3");
        Book b4 = new Book("Book 3");

        AtomicInteger count = new AtomicInteger();
        Set<Book> tree = new TreeSet<>((a,b) -> {
            count.getAndIncrement();
            return a.getTitle().compareTo(b.getTitle());
        });
        // BookCompare bookCompare = new BookCompare();
        //Set<Book> tree1 = new TreeSet<>(bookCompare);

        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        tree.add(b4);

        System.out.println(tree + "number of books is " + tree.size());

    }

}
