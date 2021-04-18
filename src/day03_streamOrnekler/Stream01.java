package day03_streamOrnekler;

import java.util.ArrayList;
import java.util.List;

public class Stream01 {
    public static void main(String[] args) {
        List<Integer> rakamlar = new ArrayList<>();
        rakamlar.add(5);
        rakamlar.add(7);
        rakamlar.add(9);
        rakamlar.add(10);
        rakamlar.add(13);
        rakamlar.add(15);
        rakamlar.add(16);
        rakamlar.add(18);
        rakamlar.add(-200);
        rakamlar.add(7);

        System.out.println("\n=========Cift Sayilar(Method)==========");
        ciftleriYazdir(rakamlar);
    }
    public static void ciftleriYazdir(List<Integer> liste){
        liste.stream().filter(x-> x%2==0).forEach(x-> System.out.println(x));
        System.out.println("=======Method referansiyla=======");
        liste.stream().filter(Stream01::ciftMi).forEach(System.out::print);
    }
    public static boolean ciftMi(int x){

        return x%2==0;
    }
}
