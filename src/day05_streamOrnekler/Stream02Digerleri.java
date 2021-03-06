package day05_streamOrnekler;
import day04_streamOrnekler.Metodlar;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class Stream02Digerleri {
    /*
          Collection'larimizi stream method;u ile Stream'e cevirmeyi ogrendik.
          Collection : List,Map,HashMap vb..
          Stream'e cevirdikten sonra Stream API kullanarak pipeLine'a sokuyorduk.
          IntStream : Integer seklinde Stream olusturabiliriz.
          LongStream, DoubleStream
          Bunlarin ne artisi var ? Sayisal degerlerle islem yapacaksak isleri kolaylastiriyor.
          Biz istersek Integer, Double, Long tipinde Stream'ler olusturabiliyoruz.
         */
    public static void main(String[] args) {
        System.out.println("Toplam: "+topla(4));
        topla1(4);
        System.out.println("========");
        tekTopla(1,7);
        System.out.println("Faktoriyel: "+faktoriyel(10));
        System.out.println("Faktoriyel long deger ile: "+faktorLong(20));

        System.out.println("Faktoriyel double : "+faktorDouble(20));

        System.out.println("NOtları 50'den büyük olanlar: "+doubleDiziCevirList());
    }
    //****************************************************************************************************
    // ÖRNEK25: 1'den belirtilen değere kadar olan tamsayıları toplayan ve sonucu döndüren metodu yazınız.
    //****************************************************************************************************

    public static int topla (int deger){

        return IntStream.range(1,deger+1).sum();
    }
    public static void topla1 (int deger){

        IntStream.rangeClosed(1,deger).forEach(System.out::println);
    }
    public static void tekTopla(int alt, int ust){
        System.out.println(IntStream.rangeClosed(alt,ust).filter(Metodlar::tekMi).sum());

        }
    //****************************************************************************************************
    // ÖRNEK27: Berlirtilen sayının faktoriyelini hesaplayan metodunu tanımlayınız.
    //****************************************************************************************************
    public static int faktoriyel (int n){

        return IntStream.rangeClosed(1,n).reduce(1,(x,y)->x*y);
        }

    public static Long faktorLong (int n){

        return LongStream.rangeClosed(1,n).reduce(1,(x, y)->x*y);
    }
    public static double faktorDouble (int n){

        return DoubleStream.iterate(1,t->t+1).limit(n).reduce(1,(x,y)->x*y);
    }
    //*********************************************************************************************
    // ÖRNEK28: Bir double diziyi (notlar) Stream nesnesine dönüştürerek bu dizi içerisinde bulunan
    // sayıların 50 den büyük olanlarını ayrı bir listeye kaydererek yazdıran metodu tanımlayınız
    //**********************************************************************************************
    public static List<Double> doubleDiziCevirList(){
        Double [] notlar = { 88.5, 52.3, 88.9, 100.0, 99.6, 42.0, 10.0};
        Stream<Double> streamNotlar = Stream.of(notlar);
        return streamNotlar.filter(t->t>50.0).collect(Collectors.toList());
    }
}

