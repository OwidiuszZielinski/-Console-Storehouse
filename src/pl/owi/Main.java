package pl.owi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import pl.owi.Storehouse;
//ignore dodaj

public class Main {

    public static void main(String[] args) {

        Storehouse storehouse = new Storehouse();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Program do obługi magazynu");

        System.out.println("Wybierz działanie");

        while (true) {
            //
            //Zmiana
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
                    storehouse.nowalista();//czy konieczna jest ta metoda?
                    System.out.println("Utworzono listę o nazwie : " + nazwalisty);
                    //nie rozumiem dlaczego utworzylo listę i czy ją dobrze utworzylo bo nie zrobilem metody tworzenia list,
                    //chyba ze konstruktor robi listy
                    break;

                case 2:
                    System.out.println("Wprowadź  :");

                    System.out.print("Nazwa towaru : ");
                    ProductPC temp = new ProductPC();
                    temp.setNazwa(scanner.next());

                    System.out.print("Grupa towaru : ");
                    temp.setGrupa(scanner.next());

                    System.out.print("Cena netto towaru : ");
                    temp.setCenanetto(scanner.nextInt());

                    System.out.print("Wysokość stawki vat : ");
                    temp.setVat(scanner.nextInt());

                    System.out.print("Ilość : ");
                    temp.setIlosc(scanner.nextInt());




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