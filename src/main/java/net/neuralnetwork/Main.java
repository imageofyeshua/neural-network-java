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
    public static void main(String[] args) {
        // inputs
        double[] x =  {0, 1};

        // weights
        double[] w = {0.5, 0.5};

        // bias
        double b = 0.5;

        // weighted sum
        double z = 0.0;

        for (int i = 0; i < x.length; i++) {
            z += x[i] * w[i];
        }
         z += b;

        // activation function
        double a = z > 0 ? 1.0 : 0.0;

        // print activation [output]
        out.println(a);
    }
}