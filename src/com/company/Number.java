package com.company;

public class Number {
    double num1;
    long num2;

    public Number() {
        this.num1 = num1;
        this.num2 = num2;
    }

    public boolean isZero(double num1) {
        if (num1 == 0.0) return true;
        else return false;
    }

    public boolean isPositive(double num1) {
        if (num1 > 0.0) return true;
        else return false;
    }

    public boolean isNegative(double num1) {
        if (num1 < 0.0) return true;
        else return false;
    }

    public boolean isOdd(double num1) {
        if (num1 % 2 != 0.0) return true;
        else return false;
    }

    public boolean isEven(double num1) {
        if (num1 % 2 == 0.0) return true;
        else return false;
    }

    public boolean isPrime(double num1) {
        int count = 0;
        if (num1 == 0 || num1 == 1) {             // 0 and 1 are not prime numbers
            return false;
        } else if (num1 < 0) {                // negative numbers are not prime numbers
            return false;
        } else {
            for (int i = 1; i <= num1; i++) {        // number should be divided by one and the number itself
                if (num1 % i == 0) count++;
            }
            if (count == 2) return true;
            else return false;
        }

    }

    public boolean isArmstrong(double num1) {
        if (num1 == 0.0) return true;
        else return false;              //decimals cannot be armstrong e.g. 153.0 not an armstrong number
    }


    public double getFactorial(long num2) {
        {
            double fact = 1;
            for (int i = 1; i <= num2; i++) {
                fact *= i;
                num2 = num2 / 10;
            }
            return fact;
        }
    }

    public double getSqrt(double num1) {
        double temp, sqrt;
        sqrt = num1 / 2;
        do {
            temp = sqrt;
            sqrt = (temp + (num1 / temp)) / 2;
        } while ((temp - sqrt) != 0);
        return sqrt;
    }

    public double getSqr(double num1) {
        return num1 * num1;
    }

    public double getReverse(long num2) {
        double reverseNum;
        StringBuffer rev;
        StringBuffer sb = new StringBuffer(String.valueOf(num2));          // converting to string and then reversing it
        rev = sb.reverse();
        reverseNum = Double.parseDouble(String.valueOf(rev));            // converting string back to double
        return reverseNum;
    }

    public double sumDigits(long num2) {
        double sum = 0;
        while (num2 > 0) {
            sum = sum + num2 % 10;
            num2 = num2 / 10;
        }
        return sum;
    }

    public void dispBinary(long num2) {
        System.out.println("ByteValue of " +num2 +" is " + Long.toBinaryString(num2));
    }

    public void listFactor(long num2) {
        System.out.println("Factors of " + num2 + " are");
        for (int i = 1; i <= num2; i++) {
            if (num2 % i == 0) {
                System.out.print(i + " ");
            }
        }

    }

    public static void main(String args[]) {
        Number mynum = new Number();
        mynum.num2=144;
        mynum.num1=199.3;
        System.out.println("The given numbers are :" + mynum.num1 +" and "+ mynum.num2);
        System.out.println("isZero " + mynum.isZero(199.3));
        System.out.println("isPositive " + mynum.isPositive(199.3));
        System.out.println("isNegative " + mynum.isNegative(199.3));
        System.out.println("isOdd  " + mynum.isOdd(199.3));
        System.out.println("isEven " + mynum.isEven(199.3));
        System.out.println("isArmstrong  " + mynum.isArmstrong(199.3));
        System.out.println("isPrime " + mynum.isPrime(199.3));
        System.out.println("getFactorial " + mynum.getFactorial(144));
        System.out.println("getSqrt " + mynum.getSqrt(199.3));
        System.out.println("getSqr  " + mynum.getSqr(199.3));
        System.out.println("sumDigits " + mynum.sumDigits(144));
        System.out.println("getReverse  " + mynum.getReverse(144));
        mynum.dispBinary(144);
        mynum.listFactor(144);

    }
}