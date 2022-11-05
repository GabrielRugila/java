package unit.unittest.src.main;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Main {
    
    static double[] prices = new double[] {2.23, 1.32, 4.32, 11.33};

    public static void main(String[] args) {   


    }

    public static double getSubtotal() {
        double temp = 0;
        for (int i = 0; i <prices.length ; i++) {
            temp += prices[i];
        }
        return temp;
    }
    public static double getTax(double subTotal) {
        DecimalFormat formatter = new DecimalFormat("#.##", new DecimalFormatSymbols(Locale.ENGLISH));
        return Double.parseDouble(formatter.format(subTotal * 0.13));
    }

    public static double getTotal(double subtotal, double tax) {
        return subtotal + tax;
    }
}
