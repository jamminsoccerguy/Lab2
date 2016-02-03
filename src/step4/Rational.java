package step4;

/**
 * Created by Mike Plucker
 * Date: 2/3/2016
 * Class: CSCI 1933-12
 */

/**
 * Lab 2: Step 4
 */
public class Rational {

    //field variables
    private int numerator;
    private int denominator;

    //constructor
    public Rational(int numerator, int denominator){
        this.numerator = numerator;

        if(denominator == 0){
            throw new IllegalArgumentException("Error: Denominator can't be 0!");
        }
        this.denominator = denominator;
    }

    public int getNumerator(){
        return numerator;
    }

    public void setNumerator(int numerator){
        this.numerator = numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    public void setDenominator(int denominator){
        if(denominator == 0){
            throw new IllegalArgumentException("Error: Denominator can't be 0!");
        }
        this.denominator = denominator;
    }

    //Returns the reciprocal of the rational number
    public Rational reciprocal(){
        return new Rational(denominator, numerator);
    }

    //Adds the rational number to another one that's passed as a parameter
    //	-finds the common denominator by multiplying the two denominators
    public Rational addRational(Rational rational2){
        int commonDenominator = denominator * rational2.getDenominator();
        int numerator1 = numerator * rational2.getDenominator();
        int numerator2 = rational2.getNumerator() * denominator;
        int sum = numerator1 + numerator2;

        return new Rational(sum, commonDenominator);
    }

    //Subtracts the rational number passed as a parameter from the first rational number
    //	-finds the common denominator by multiplying the two denominators
    public Rational subRational(Rational rational2){

        int commonDenominator = denominator * rational2.getDenominator();
        int numerator1 = numerator * rational2.getDenominator();
        int numerator2 = rational2.getNumerator() * denominator;
        int difference = numerator1 - numerator2;

        return new Rational(difference, commonDenominator);
    }

    //Multiplies the rational number by another one that's passed as a parameter
    public Rational mulRational(Rational rational2){

        int numerator = this.numerator * rational2.getNumerator();
        int denominator = this.denominator * rational2.getDenominator();

        return new Rational(numerator, denominator);
    }

    //Divides the rational number by another one that's passed as a parameter.
    //	-multiplies by the reciprocal of the 2nd rational
    public Rational divRational(Rational rational2){
        return mulRational(rational2.reciprocal());
    }
}
