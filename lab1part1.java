package edu.neu.mgen;

public class lab1part1 {
   // Part 1
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5};
        int[] y = {5, 4, 3, 2, 1};
        int[] z = new int[5];
        
        for (int i = 0; i < x.length; i++) {
            z[i]=Math.max(x[i],y[i]);

        }
        print("Array x", x);
        print("Array y", y);
        print("Array z = x + y", z);
    }

    public static void print(String message, int[] array) {
        System.out.print(message + " = { ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("}");
    }
        }
   





