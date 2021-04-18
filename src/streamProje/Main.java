package streamProje;

import day04_streamOrnekler.Metodlar;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

public class Main {
    private static List<Ogrenci> ogrListesi = new ArrayList<>();
    public static void main(String[] args) {

        testOgrenciOlustur();
        ismeGoreListele("ahmet");
        System.out.println("============");
        ismeGoreListele("ayse");
        System.out.println("============");
        ismeGoreListele("john");
        System.out.println("======Cinsiyete Gore Siralanmis Liste======");
        cinsiyeteGoreListele("erkek");
        System.out.println("======Yasa Gore Siralanmis soyadi Can olanlar======");
        yasaGoreListele();
        System.out.println("=====Nota Gore Siralanmis Liste=======");
        notaGoreListele();
        System.out.println("======Yasa Gore Azalan Liste ======");
        yasaGoreAzalanListele();
        System.out.println("======Not Ortalamasi Sirali Liste======");
        notOrtalamasiSiraliListe();
        System.out.println("======Yasa ve Cinsiyete Gore Liste ======");
        yasVeCinsiyeteGoreListe(20,"kadin");
        System.out.println("=====Notlari Elli altinda olan erkeklerin Listesi=======");
        notlariEllialtindaOlanErkeklistesi(50,"erkek");


    }
    private static void testOgrenciOlustur() {
        ogrListesi.add(new Ogrenci("Ahmet", "Can", 30, 95.5, "erkek"));
        ogrListesi.add(new Ogrenci("Ahmet", "Baki", 18, 90.1, "erkek"));
        ogrListesi.add(new Ogrenci("Ayse", "Can", 21, 82.3, "kadin"));
        ogrListesi.add(new Ogrenci("Mustafa", "Can", 15, 75.4, "erkek"));
        ogrListesi.add(new Ogrenci("Ayse", "Yılmaz", 40, 45, "kadin"));
        ogrListesi.add(new Ogrenci("Ali", "Veli", 80, 35.5, "erkek"));
        ogrListesi.add(new Ogrenci("Veli", "Oztürk", 20, 95.5, "erkek"));
        ogrListesi.add(new Ogrenci("Arif", "Kapi", 25, 55.5, "erkek"));
        ogrListesi.add(new Ogrenci("Gul", "Türker", 18, 80.7, "kadin"));
        ogrListesi.add(new Ogrenci("Mustafa", "Koca", 35, 45.8, "erkek"));
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
    private static void yasaGoreListele() {
        ogrListesi.stream().
                sorted(Comparator.comparing(Ogrenci::getYas)).
                filter(t->t.getSoyAd().equalsIgnoreCase("Can")).
                forEach(System.out::println);
    }
    private static void notaGoreListele(){
        ogrListesi.stream().
                sorted(Comparator.comparing(Ogrenci::getDiplomaNotu)).
                forEach(System.out::println);
    }
    private static void yasaGoreAzalanListele(){
        ogrListesi.stream().
                sorted(Comparator.comparing(Ogrenci::getYas).reversed()).
                forEach(System.out::println);
    }
    private static void notOrtalamasiSiraliListe(){
       OptionalDouble ort= ogrListesi.stream().mapToDouble(Ogrenci::getDiplomaNotu).average();
        System.out.println(ort);

    }
    private static void yasVeCinsiyeteGoreListe(int i, String cins){
        ogrListesi.stream().filter(t-> t.getYas()>20 && t.getCinsiyet().equals(cins)).
                forEach(System.out::println);

    }
    private static void notlariEllialtindaOlanErkeklistesi(int not, String cins){
        ogrListesi.stream().
                filter(t-> t.getDiplomaNotu()<not && t.getCinsiyet().equals(cins)).
                forEach(System.out::println);
    }






}
