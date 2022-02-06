package pl.owi;

import java.util.Scanner;
import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {

        Storehouse storehouse = new Storehouse(100);
        Scanner scanner = new Scanner(System.in);

        while (true){

            System.out.println("Program do obługi magazynu");

            System.out.println("Wybierz działanie");

            System.out.println("1.Utwórz listę stanu magazynowego");

            System.out.println("2.Dodaj towar");

            int choice = scanner.nextInt();

            switch (choice){
                case 1 :

                    System.out.println("Wprowadź grupę towarów - 'Spożywcze', 'Elektroniczne', 'zabawki'");
                    String grupename = scanner.nextLine();


                case 2 :


                    System.out.println("Podaj nazwę towaru");

                    System.out.println("Podaj ilość");

                    System.out.println("Podaj cenę netto");

                    System.out.println("Podaj stawkę vat");




            }











        }



    }
}
