package step5;

/**
 * Created by Mike Plucker
 * Date: 2/3/2016
 * Class: CSCI 1933-12
 */

/**
 * Lab 2: Step 5
 */
public class Longhand {

    public static void main(String[] args) {

        //field variable
        double dollarAmount;



        Longhand convert = new Longhand(); //creates object

        if (args == null || args.length == 0){ //if no arguments are entered
            //System.out.println("No arguments entered.");
            throw new IllegalArgumentException("Error: No Arguments entered!");
        }
        else{
            for(int i = 0; i < args.length; i++){ //iterates over the arguments entered

                dollarAmount = Double.parseDouble(args[i]); //converts the command line string value to a double

                if(dollarAmount < 0 || dollarAmount > 1000000){ //validates numbers are in range
                    //System.out.println("Arguments not in valid range.");
                    throw new IllegalArgumentException("Error: Arguments Not In Valid Range!");
                }
                else{

                    //calls method to convert dollar amount to long hand form
                    System.out.println("Dollar Amount: %s" + convert.convertToString(dollarAmount));
                }

            }//end for
        }//end else
    }//end main

    public String convertToString(double dollarAmount){

        //local variables
        double singleNum = 0, tensNum = 0, hundredsNum = 0, thousandsNum = 0;
        String dollarAmountWord = "", singleWord = "", tensWord = "", hundredsWord = "", thousandsWord;

        //int count = 0; //counter
        double dollarNum = 0;
        //double temp;

        dollarNum = dollarAmount; //holds dollarAmount in a temp value


        if(dollarNum % 100 < 20){
            switch(dollarNum % 100){
                case 0:
                    singleWord = "";
                    break;
                case 1:
                    singleWord = "One";
                    break;
                case 2:
                    singleWord = "Two";
                    break;
                case 3:
                    singleWord = "Three";
                    break;
                case 4:
                    singleWord = "Four";
                    break;
                case 5:
                    singleWord = "Five";
                    break;
                case 6
                    singleWord = "Six";
                    break;
                case 7:
                    singleWord = "Seven";
                    break;
                case 8:
                    singleWord = "Eight";
                    break;
                case 9:
                    singleWord = "Nine";
                    break;
                case 10:
                    singleWord = "Ten";
                    break;
                case 11:
                    singleWord = "Eleven";
                    break;
                case 12:
                    singleWord = "Twelve";
                    break;
                case 13:
                    singleWord = "Thirteen";
                    break;
                case 14:
                    singleWord = "Fourteen";
                    break;
                case 15:
                    singleWord = "Fifteen";
                    break;
                case 16:
                    singleWord = "Sixteen";
                    break;
                case 17:
                    singleWord = "Seventeen";
                    break;
                case 18:
                    singleWord = "Eighteen";
                    break;
                case 19:
                    singleWord = "Nineteen";
                    break;
            }//end switch
            dollarAmountWord += singleWord;
            dollarNum /= 100;
        }//end if
        else{
            double temp = dollarNum % 10;
            switch(){
                case 0:
                    singleWord = "";
                    break;
                case 1:

            }
        }







        return dollarAmountWord;
    }//end method

}//end class
