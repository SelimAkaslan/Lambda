package day01_fonksiyonel;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda04 {
    public class PredicateFonksiyonelArayüzü {

    }
    public static void main(String[] args) {
        Predicate<Kişi> predicate = (kişi) -> kişi.getYaş() > 18;
        boolean sonuç = predicate.test(new Kişi("Yusuf", 20));
        System.out.println(sonuç);

        Supplier<Kişi> supplier = () -> new Kişi("Hasan", 30) ;
        Kişi kişi = supplier.get();
        System.out.println("Kişi Detayı:\n" + kişi.getIsim() + ", " + kişi.getYaş());

        List<Kişi> kişilerListesi = new ArrayList<Kişi>();
        kişilerListesi.add(new Kişi("Ali", 27));
        kişilerListesi.add(new Kişi("Veli", 26));
        Consumer<Kişi> consumer = (k) -> {
            System.out.println(k.getIsim());
            System.out.println(k.getYaş());
        };
        consumer.accept(new Kişi("Ayşe", 22));
        consumer.accept(new Kişi("Mehmet",45));

    }
    public static class Kişi {
        private String isim;
        private int yaş;
        public Kişi(String isim, int yaş) {
            this.isim = isim;
            this.yaş = yaş;
        }
        public String getIsim() {

            return isim;
        }
        public void setIsim(String isim) {

            this.isim = isim;
        }
        public int getYaş() {

            return yaş;
        }
        public void setYaş(int yaş) {

            this.yaş = yaş;
        }
    }
}
