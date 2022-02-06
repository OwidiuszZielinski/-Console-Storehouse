package pl.owi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import pl.owi.Storehouse;

public class Main {

    public static void main(String[] args) {


        Storehouse storehouse = new Storehouse();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Program do obługi magazynu");

        System.out.println("Wybierz działanie");

        while (true) {


            //System.out.println("Co dalej?");

            System.out.println("1.Utwórz listę przedmiotów w magazynie");

            System.out.println("2.Dodaj towar");

            System.out.println("3.Wyświetl przedmioty w magazynie i wolne miejsce");

            System.out.println("4.Usuń element");

            System.out.println("5.Zakończ");

            int choice = scanner.nextInt();


            switch (choice) {
                case 1:

                    System.out.println("Nazwij listę towarów - ");
                    String nazwalisty = scanner.next();
                    System.out.println("Utworzono listę o nazwie : " + nazwalisty);
                    break;

                case 2:
                    System.out.println("Wprowadź  :");

                    System.out.print("Nazwa towaru : ");
                    String nazwa = scanner.next();

                    System.out.print("Grupa towaru : ");
                    String grupa = scanner.next();

                    System.out.print("Cena netto towaru : ");
                    Integer netto = scanner.nextInt();

                    System.out.print("Wysokość stawki vat : ");
                    Integer vat = scanner.nextInt();

                    System.out.print("Ilość : ");
                    Integer ilosc = scanner.nextInt();


                    storehouse.dodajelement(nazwa,grupa,netto,vat,ilosc);

                    break;


                case 3:

                    storehouse.pokazliste();

                    storehouse.pokazdlugosclisty();






                    break;

                case 4:


                    break;

                case 5:
                    break;

                case 6:
                    break;


            }
        }
    }
}