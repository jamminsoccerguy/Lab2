package step1;

/**
 * Created by Mike Plucker
 * Date: 2/3/2016
 * Class: CSCI 1933-12
 */

/**
 * Lab 2: Steps 1 and 2
 */
public class Av {

    //one main problem is that there is no way to ensure that users enter numbers(ints, doubles...)
    //they could enter what ever they want to(strings, chars...)

    //one solution would be to throw an exception if the user entered anything other than an int/float.

    //another solution would be to create the program to ask the user to enter a number, rather than rely
    //on the arguments when running the program...this would be easy to verify that they entered a number
    //correctly also.
    public static void main(String[] args) {

        //variables
        int count = 0; //counter
        double total = 0;
        double average;

        if (args == null || args.length == 0){ //if no arguments are entered
            System.out.println("No arguments entered.");
        }
        else{
            for (int i = 0;  i < args.length;  i++){ //iterates over the arguments entered
                total += Double.valueOf(args[i]); //gets scalar double equivalent of the argument and adds it to total
                count++; //increment counter
            }

            average = total / count;

            System.out.printf("Average of %.1d value(s) entered is: %.1f", count, average);
        }
    }
}
