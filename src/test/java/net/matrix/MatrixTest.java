package net.matrix;

import org.junit.jupiter.api.Test;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MatrixTest {
    @Test
    public void constructionTest() {
        Matrix m = new Matrix(3, 4, i -> i * 2);

        String text = m.toString();

        double[] exptected = new double[12];

        for (int i = 0; i < exptected.length; i++) {
            exptected[i] = i * 2;
        }

        var rows = text.split("\n");

        assertTrue(rows.length == 3);

        int index = 0;

        for (var row: rows) {
            var values = row.split("\\s+");

            for (var textValue: values) {
                if (textValue.length() == 0) {
                    continue;
                }

                var doubleValue = Double.valueOf(textValue);

                assertTrue(Math.abs(doubleValue - exptected[index]) < 0.001);
                index++;
            }
        }
    }

}