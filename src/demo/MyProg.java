package demo;

/**
 * Created by Mike Plucker
 * Date: 2/3/2016
 * Class: CSCI 1933-12
 */

/**
 * Command line Demo
 */
public class MyProg {
    public static void main(String[] args) {
        for (int i = 0; i < args.length ; i++) {
            System.out.format("For argument %d, you typed in: %s\n", i, args[i]);
        }
    }
}
