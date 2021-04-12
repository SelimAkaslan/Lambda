package day01_fonksiyonel;

import java.util.Arrays;
import java.util.List;

public class Lambda01Kurallar {

    public static void main(String[] args) {
        List<Integer> liste = Arrays.asList(1,2,3,4,5);
    liste.forEach(x -> System.out.println(x));


        System.out.println("=============");


        liste.forEach(x -> {
            x += 2;
            System.out.println(x);
        });

        System.out.println("=============");
        liste.forEach((Integer x) -> {
            x += 2;
            System.out.println(x);
        });

        System.out.println("=============");

       liste.forEach(x -> {
            int y = x * 2;
            System.out.println(y);
        });
    }

}
