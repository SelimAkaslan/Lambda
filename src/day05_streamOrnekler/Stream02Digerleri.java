package day05_streamOrnekler;
import day04_streamOrnekler.Metodlar;
import java.util.stream.IntStream;

public class Stream02Digerleri {
    public static void main(String[] args) {
        System.out.println("Toplam: "+topla(4));
        topla1(4);
        System.out.println("========");
        tekTopla(1,7);
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
    }
/*
          Collection'larimizi stream method;u ile Stream'e cevirmeyi ogrendik.
          Collection : List,Map,HashMap vb..
          Stream'e cevirdikten sonra Stream API kullanarak pipeLine'a sokuyorduk.
          IntStream : Integer seklinde Stream olusturabiliriz.
          LongStream, DoubleStream
          Bunlarin ne artisi var ? Sayisal degerlerle islem yapacaksak isleri kolaylastiriyor.
          Biz istersek Integer, Double, Long tipinde Stream'ler olusturabiliyoruz.
         */
