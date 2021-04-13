package day02_streamOrnekler;

import java.util.ArrayList;
import java.util.List;

public class Stream01Integer {

    public static void main(String[] args) {
        List<Integer> rakamlar = new ArrayList<>();
        rakamlar.add(5);
        rakamlar.add(7);
        rakamlar.add(9);
        rakamlar.add(10);
        rakamlar.add(13);
        rakamlar.add(15);
        rakamlar.add(16);
        rakamlar.add(18);
        rakamlar.add(-200);
        rakamlar.add(7);

        rakamlar.stream().filter(t-> t%2!=0).forEach(System.out ::println); //t-> System.out.println(t+ " ") bu sekilde de yazdirilir
        System.out.println("===================");
        rakamlar.stream().filter(t-> t%2==0).forEach(t-> System.out.println(t+" "));

        rakamlar.stream().filter(t-> t%2==0).forEach(Stream01Integer::yazdir);

    }
    public static void yazdir(int x){
        System.out.print(x+" ");
    }

}
