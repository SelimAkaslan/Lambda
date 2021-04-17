package streamProje;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    private static List<Ogrenci> ogrListesi = new ArrayList<>();
    public static void main(String[] args) {

        testOgrenciOlustur();
        ismeGoreListele("ahmet");
        System.out.println("============");
        ismeGoreListele("ayse");
        System.out.println("============");
        ismeGoreListele("john");
        System.out.println("============");
        cinsiyeteGoreListele("erkek");

    }

    private static void ismeGoreListele(String isim){
        ogrListesi.stream().
                filter(t->t.getAd().equalsIgnoreCase(isim)).
                forEach(System.out::println);
    }

    private static void cinsiyeteGoreListele(String cins){
        ogrListesi.stream().
                filter(t-> t.getCinsiyet().equalsIgnoreCase(cins)).
                filter(t-> t.getAd().startsWith("A")).
                forEach(System.out::println);
    }


    private static void testOgrenciOlustur() {
        ogrListesi.add(new Ogrenci("Ahmet", "Can", 30, 95.5, "erkek"));
        ogrListesi.add(new Ogrenci("Ahmet", "Baki", 18, 90.1, "erkek"));
        ogrListesi.add(new Ogrenci("Ayse", "Can", 21, 82.3, "kadın"));
        ogrListesi.add(new Ogrenci("Mustafa", "Can", 15, 75.4, "erkek"));
        ogrListesi.add(new Ogrenci("Ayse", "Yılmaz", 40, 45, "kadın"));
        ogrListesi.add(new Ogrenci("Ali", "Veli", 80, 35.5, "erkek"));
        ogrListesi.add(new Ogrenci("Veli", "Oztürk", 20, 95.5, "erkek"));
    }

}
