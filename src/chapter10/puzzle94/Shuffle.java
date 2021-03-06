package chapter10.puzzle94;

import java.util.Arrays;
import java.util.Random;

public class Shuffle {

    private static Random rnd = new Random();


    public static void shuffle(Object[] a) {
        for (int i = 0; i < a.length; i++)
            swap(a, i, rnd.nextInt(a.length));
    }

    private static void swap(Object[] a, int i, int j) {
        Object tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void main(String[] args) {

        /*
        To make this concrete, let's consider an array of length 3 containing the strings "a", "b", and "c".
        There are 3^3 = 27 possible executions of the shuffle method.
        All are equally likely, and each generates some permutation.
        There are 3! = 6 distinct permutations of the array:
        {"a", "b", "c"}, {"a", "c", "b"}, {"b", "a", "c"}, {"b", "c", "a"}, {"c", "a", "b"}, and {"c", "b", "a"}.
        Because 27 is not divisible by 6, some of these permutations
        must be generated by more executions than others, so the shuffle method is not fair.
         */

        Object[] a = {"a", "b", "c"};
        shuffle(a);
        System.out.println(Arrays.toString(a));
    }

}
