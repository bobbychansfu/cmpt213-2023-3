package ca.cmpt213.iterableDemo;

import java.util.Iterator;

public class MatrixTest {
    public static void main(String[] args) {
        Matrix matrix = Matrix.makeSequentialMatrix(4,3);
        System.out.println(matrix);
        
        Iterator<Integer> itr = matrix.iterator();
        itr.remove();
        
        for (Integer v : matrix) {
            System.out.println(v);
        }
    }


}
