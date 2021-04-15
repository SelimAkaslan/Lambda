package day04_streamOrnekler;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Stream02String {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        liste.add("Ali");
        liste.add("Mark");
        liste.add("Jackson");
        liste.add("Amanda");
        liste.add("Mariano");
        liste.add("Alberto");
        liste.add("Tucker");
        liste.add("Christ");

  basHarfA(liste);
        System.out.println("===============");
  buyukHarfeCevir(liste);

    }
    //Listede bas harfi "A" ile baslayanlari yazdiralim.
    public static void basHarfA(List<String> liste){
        liste.stream().filter(h-> h.startsWith("A")).forEach(System.out::println);

    }
    public static void buyukHarfeCevir(List<String> liste){
        liste.stream().map(h-> h.toUpperCase()).forEach(System.out::println);

    }
}
