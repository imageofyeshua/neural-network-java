package net.matrix;

import org.junit.Test;

import static java.lang.System.out;

public class MatrixTest {
    @Test
    public void constructionTest() {
        Matrix m = new Matrix(3, 4, i -> i * 2);
        out.println(m);
    }

}