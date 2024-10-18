package net.neuralnetwork;

import static java.lang.System.out;

/*
 *    INPUT  AND   OR   XOR   NOR   NAND   XNOR
 *     00     0    0     0     1      1      1
 *     01     0    1     1     0      1      0
 *     10     0    1     1     0      1      0
 *     11     1    1     0     0      0      1
 */

public class Main {
    static double neuron( double[] x, double[] w, double b ) {
        // weighted sum
        double z = 0.0;

        for (int i = 0; i < x.length; i++) {
            z += x[i] * w[i];
        }
        z += b;

        // activation function
        return z > 0 ? 1.0 : 0.0;
    }

    static double and(double x1, double x2) {
        return neuron(new double[] {x1, x2}, new double[] {1, 1}, -1);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
           double x1 = i / 2;
           double x2 = i % 2;

           double output = and(x1, x2);
           out.printf("%d%d\t%d\n", (int)x1, (int)x2, (int)output);
        }
    }
}