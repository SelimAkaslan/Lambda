package day01_fonksiyonel;

import java.util.Scanner;
import java.util.function.Function;

public class Lambda03 {


    public static void main(String[] args) {
        System.out.print("Virgülle ayrılmış olarak sayıları giriniz:");
        Scanner scanner = new Scanner(System.in);
        String[] giriş = scanner.nextLine().split(",");
        Function<String, Integer> çevirici = x -> Integer.parseInt(x);
        int toplam = 0;
        for (String s : giriş) {
            toplam += çevirici.apply(s);
        }
        System.out.println("Sayısı = " + giriş.length);
        System.out.println("Toplamı = " + toplam);

    }
}
