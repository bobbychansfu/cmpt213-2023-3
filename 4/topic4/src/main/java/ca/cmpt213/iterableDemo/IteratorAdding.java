package ca.cmpt213.iterableDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class IteratorAdding {

    public static void main(String[] arg) {
        ArrayList<Integer> intlist = createData(11);
        System.out.println(intlist);
        System.out.println(sumListOfIntegers(intlist));
        System.out.println(intlist);
    }

    private static ArrayList<Integer> createData(int size){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < size; i++){
            Random rand = new Random();
            int r = rand.nextInt(100);  // 0-99
            result.add(r);
        }
        return result;
    }

    private static int sumListOfIntegers(List<Integer> data) {
        Iterator<Integer> itr = data.iterator();
        int res = 0;
        while (itr.hasNext()) {

            res += itr.next();
            
        }
        return res;

    }
}
