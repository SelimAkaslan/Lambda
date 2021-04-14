package day03_streamOrnekler;

import day02_streamOrnekler.Stream01Integer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Reduce01 {
    public static void main(String[] args) {
        // reduce() : Indirgeme veya azaltma anlamina gelir.
        // Bir stream in bir ture veya bir primitive donusmesini saglayan terminal islemdir
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

        System.out.println("=========Teklerin kupuToplami(Method)==========");
        tekKupToplami(liste);
        System.out.println("Toplam : "+ tekKupToplami(liste));
        System.out.println("tekKupToplami = " + tekKupToplami(liste).get());// Optional yazisini kaldirmak icin
    }

    private static Optional<Integer> tekKupToplami(List<Integer> toplam) {
      //  return toplam.stream().filter(Stream01Integer::tekMi).map(x-> x*x*x).reduce(0,(x,y)->(x+y));
       return toplam.stream().filter(Stream01Integer::tekMi).map(x-> x*x*x).reduce(Math::addExact);
       //return toplam.stream().filter(Stream01Integer::tekMi).map(x-> x*x*x).reduce(0, Integer::sum);

    }
}
