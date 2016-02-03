package step3;

/**
 * Created by Mike Plucker
 * Date: 2/3/2016
 * Class: CSCI 1933-12
 */

/**
 * Lab 2: Step 3
 */
public class GPA {

    public static void main(String[] args) {

        //field variables
        int gradeCount = 0, creditCount = 1; //counters
        double creditHour = 0, grade = 0, gradePoint = 0, totalCreditHours = 0, totalGradePoints = 0, gpa;

        if (args == null || args.length == 0){ //if no arguments are entered
            System.out.println("No arguments entered.");
        }
        else{
            for (int i = 0;  i < args.length;  i++){ //iterates over the arguments entered

                if(gradeCount < args.length){ //iterates through grades in args array
                    switch(args[gradeCount].toUpperCase()){ //decides appropriate grade points for each grade entered
                        case "A":
                            grade = 4;
                            break;
                        case "A-":
                            grade = 3.66;
                            break;
                        case "B+":
                            grade = 3.33;
                            break;
                        case "B":
                            grade = 3;
                            break;
                        case "B-":
                            grade = 2.66;
                            break;
                        case "C+":
                            grade = 2.33;
                            break;
                        case "C":
                            grade = 2;
                            break;
                        case "C-":
                            grade = 1.66;
                            break;
                        case "D+":
                            grade = 1.33;
                            break;
                        case "D":
                            grade = 1;
                            break;
                        case "F":
                            grade = 0;
                            break;
                    }//end switch

                    System.out.printf("Letter Grade = %s\n", args[gradeCount].toUpperCase());
                    gradeCount += 2; //increment counter by 2 so that it only looks at every other argument (only looks at grades)
                    System.out.printf("Grade Points = %.2f\n", grade);
                }//end if

                if(creditCount < args.length){ //iterates through credits in args array
                    creditHour = Double.parseDouble(args[creditCount]); //converts string to double
                    creditCount += 2; //increment counter by 2 to convert every other argument to a double (only looks at credits)
                    System.out.printf("Credit Hours = %.0f\n", creditHour);
                    totalCreditHours += creditHour; //adds credit hours per class to totalCreditHours
                }//end if

                gradePoint = grade * creditHour; //calculates grade points per class
                System.out.printf("Grade Points for This Class = %.2f\n\n", gradePoint);
                totalGradePoints += gradePoint; //adds grade points per class to totalGradePoints
            }//end for

            gpa = totalGradePoints / totalCreditHours; //calculates GPA
            System.out.printf("Total Grade Points = %.2f\n", totalGradePoints);
            System.out.printf("Total Credit Hours = %.0f\n", totalCreditHours);
            System.out.printf("GPA = %.2f\n\n", gpa);
        }//end else
    }//end main
}//end class
