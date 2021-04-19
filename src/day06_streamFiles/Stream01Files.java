package day06_streamFiles;



import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Stream;

public class Stream01Files {
    public static void main(String[] args) throws IOException {
        String filePath="/Users/buse/IdeaProjects/Lambda/src/day06_streamFiles/mars.txt";

        Stream<String> satirlar = Files.lines(Paths.get("/Users/buse/IdeaProjects/Lambda/src/day06_streamFiles/mars.txt"));
        satirlar.forEach(System.out::println);
        System.out.println("=======================================");

        // Bir dosyadan okunan satırları büyük harf olarak konsola yazdıralım
        Files.lines(Paths.get(filePath)).
        map(t-> t.toUpperCase()). // veya map(String :: toUpperCase) de kullanilabilir
                forEach(System.out::println);
        System.out.println("=======================================");
        Files.lines(Paths.get(filePath)).
                map(t-> t.toUpperCase()).
                limit(1).
                forEach(System.out::println);
        System.out.println("=======================================");
        // Dosyanin 3 ve 4. satirlarini yazdirmak istiyoruz.
        Files.lines(Paths.get(filePath)).
                map(t-> t.toUpperCase()).
                skip(2).
                limit(2).
                forEach(System.out::println);
        System.out.println("=================2. YOL======================");
        Files.lines(Paths.get(filePath)).
                map(t-> t.toUpperCase()).
                limit(4).
                skip(2).
                forEach(System.out::println);

        System.out.println("=======================================");
        // bu kelimsenin kac defa gectugunu bulalim
        int count =0;
        System.out.println(Files.lines(Paths.get(filePath)).
                map(String::toLowerCase).
                filter(t-> t.contains("o")).
                count());

        System.out.println("=======================================");
        // Dosyadaki tum farkli kelimeleri alt alta yazdiralim
        Files.lines(Paths.get(filePath)).
                map(t-> t.toLowerCase().
                        split(" ")).
                flatMap(Arrays::stream).
                distinct().
                forEach(System.out::println);
    // dosyada kac farkli kelime kullanilmis
        System.out.println(Files.lines(Paths.get(filePath)).
                map(t-> t.toLowerCase().
                        split(" ")).
                flatMap(Arrays::stream).
                distinct().
                count());

// Kelimler icinde kac tene m harfi geciyor yazalim
        long mHarfi= Files.lines(Paths.get(filePath)).
                map(t-> t.toLowerCase().
                        split("")).
                flatMap(Arrays::stream).
                filter(t-> t.contains("m")).
                count();
        System.out.println("m Harfi Sayisi : "+mHarfi);
//Boşluk ve noktalama işaretleri hariç dosyada kaç adet karakter kullanıldığını
// hesaplayarak sonucu konsola yazdıran uygulamayı yazınız.
        long karekterler=Files.lines(Paths.get(filePath)).
                map(t-> t.replace("_","").
                        replaceAll("\\W","").
                        split("")).
                flatMap(Arrays::stream).
                count();
        System.out.println(karekterler);

    }

}