package Cars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                1.Mers
                2.BMW
                3.AUDI
                4.CAMRY
                5.FIT
                6.NISSAN
                7.ACCORD
                """);
        switch (scanner.nextLine()) {
            case "1"-> System.out.println("Объем 2,4: Автоунанын 1 километринин баасы SOM " + TransportType.MERS.calculateTravelCost(1000));
            case "2"-> System.out.println("Объем 4.6: Автоунанын 1 километринин баасы SOM "+TransportType.BMW.calculateTravelCost(1000));  // 1km
            case "3"-> System.out.println("Объем 4.4: Автоунанын 1 километринин баасы SOM "+TransportType.AUDI.calculateTravelCost(1000));
            case "4"-> System.out.println("Объем 3,4: Автоунанын 1 километринин баасы SOM "+TransportType.CAMRY.calculateTravelCost(1000));
            case "5"-> System.out.println("Объем 1.6: Автоунанын 1 километринин баасы SOM "+TransportType.FIT.calculateTravelCost(1000));
            case "6"-> System.out.println("Объем 2.6: Автоунанын 1 километринин баасы SOM "+TransportType.NISSAN.calculateTravelCost(1000));
            case "7"-> System.out.println("Объем 3.6: Автоунанын 1 километринин баасы SOM "+TransportType.ACCORD.calculateTravelCost(1000));
        }


    }
}




