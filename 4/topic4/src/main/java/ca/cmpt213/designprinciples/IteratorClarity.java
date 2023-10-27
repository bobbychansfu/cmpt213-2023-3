package ca.cmpt213.designprinciples;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IteratorClarity {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        ListIterator<String> iterator = list.listIterator();
        iterator.next(); // A|BC
        iterator.add("X"); // AX|BC
        

        iterator.previous(); // AXB|C
        iterator.remove();
        System.out.println(list);
    }

}
