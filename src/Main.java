import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                1.Chui
                2.Yssyk-kul
                3.Naryn
                4.Talas
                5.Jalal-Abad
                6.Osh
                7.Batken
             
                """);

        switch (new Scanner(System.in).nextLine()){
            case "1" -> System.out.print(Region.CHYI.region());
            case "2"-> System.out.print(Region.YSSYKKUL.region());
            case "3"-> System.out.print(Region.NARYN.region());
            case "4"-> System.out.print(Region.TALAS.region());
            case "5"-> System.out.print(Region.JALALABAT.region());
            case "6"-> System.out.print(Region.OSH.region());
            case "7"-> System.out.print(Region.BATKEN.region());
        }


    }
}