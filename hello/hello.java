package hello;

public class hello {
    
    public static void main(String[] args) {
        /* 
        // value outputing
        System.out.println("Hello World!");
        // basic operations and var assignings
        int firstNumber = (10 + 5) + (2 * 10);
        int secondNumber = 12;
        int thirdNumber = firstNumber * 2;
        int sum = firstNumber + secondNumber + thirdNumber;
        int last = 1000 - sum;

        System.out.println(last);
        */
        /* 
        // min and max Int type
        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer.minValue: " + minIntValue);
        System.out.println("Integer.maxValue: " + maxIntValue);
        */
        /* 
        // data types and min/max values (byte, int, long, short)
        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("Byte.minValue: " + minByte);
        System.out.println("Byte.maxValue: " + maxByte);

        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        System.out.println("Short.minValue: " + minShort);
        System.out.println("Short.maxValue: " + maxShort);

        long longValue = 100L;
        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.println(longValue);
        System.out.println("Long.minValue: " + minLong);
        System.out.println("Long.maxValue: " + maxLong);
        */
        /* 
        // other data types
        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        System.out.println(minFloat);
        System.out.println(maxFloat);
        
        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        System.out.println(minDouble);
        System.out.println(maxDouble);

        int intValue = 5 / 2;
        float floatValue = 5f / 3f;
        double doubleValue = 5d / 3d;
        System.out.println(intValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);
        double pounds = 200;
        double kilogram = pounds * 0.45359237;
        System.out.println(kilogram);
        */
        /* 
        char myChar = 'D'; //only 1 character
        char unicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(unicodeChar);
        */
        /* 
        boolean trueBool = true;
        boolean falseBool = false;
        System.out.println(trueBool);
        System.out.println(falseBool);
        */
        /* 
        String firstString = "10";
        System.out.println(firstString);
        String secondString = "10";
        // will result in 1010 not 20
        System.out.println(firstString + secondString);
        int intN = 10;
        // also result in 1010 not 20
        System.out.println(firstString + intN);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("Aliens aren't real!");
            System.out.println("Aliens are real!");
        };
        
        double dNumb = 20.00d;
        double dNumb2 = 80.00d;
        double dNumb3 = (dNumb + dNumb2) * 100.00d;
        double dNumb4 = dNumb3 % 40.00d;
        System.out.println(dNumb3);
        System.out.println(dNumb4);
        boolean truth = (dNumb4 == 0) ? true : false;
        System.out.println(truth);
        if (!truth) {
            System.out.println("Got some remainder");
        } else {
            System.out.println("No remaidner");
        };
        */

        calculateScore(true, 2000, 3, 400);
        int highscore = calculateScore(true, 12000, 30, 5000);
        System.out.println(highscore);
    }

    public static int calculateScore(boolean gameOver, int score, int lvlCompleted, int bonus) {
        
        if (gameOver) {
            int finalScore = score + (lvlCompleted * bonus);
            System.out.println("Final Score 0: " + finalScore);
            return finalScore;
        };
        return -1;
    }
}
