package unit.streams;

import java.util.ArrayList;

public class Filter {

    static ArrayList<Double> prices = new ArrayList<Double>();


    public static void main(String[] args) {
        prices.add(1.99);
        prices.add(4.99);
        prices.add(10.99);
        prices.add(15.99);

        prices.stream()
                .filter((price) -> price < 5) //filter expects bool
                    .forEach((price) -> System.out.println(price)); //foreach is a void func



    }


}
