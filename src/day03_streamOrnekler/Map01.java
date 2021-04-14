package day03_streamOrnekler;

import day02_streamOrnekler.Stream01Integer;

import java.util.ArrayList;
import java.util.List;

public class Map01 {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(5);
        liste.add(7);
        liste.add(9);
        liste.add(10);
        liste.add(13);
        liste.add(15);
        liste.add(16);
        liste.add(18);
        liste.add(-200);
        liste.add(7);

        System.out.println("=========Teklerin karesi(Method)==========");
        tekKareYazdir(liste);

    }
    public static void tekKareYazdir(List<Integer> l){
        l.stream().filter(Stream01Integer::tekMi).map(x->x*x).forEach(Stream01Integer::yazdir);
        System.out.println("\n=========distinct(benzerleri cikarma)=============");
        l.stream().distinct().filter(Stream01Integer::tekMi).map(x->x*x).forEach(Stream01Integer::yazdir);
    }
}
