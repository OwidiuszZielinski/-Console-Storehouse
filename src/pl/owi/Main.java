package pl.owi;


//ignore dodaj

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        //

        System.out.println("Program do obługi magazynu");

        System.out.println("Wybierz działanie");


        Storehouse storehouse = Storehousefactory.getInstance();

        //Stworzyłem obiekt typu ArrayList przyjmujacy pojedyncza instancje z storehouse


        while (true) {


            System.out.println("1.Dodaj towar");

            System.out.println("2.Wyświetl przedmioty w magazynie i wolne miejsce");

            System.out.println("3.Usuń element");

            System.out.println("4.Zakończ");

            int choice = scanner.nextInt();


            switch (choice) {


                case 1:
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

                    storehouse.dodajelement(temp);

                    break;


                case 2:

                    storehouse.pokazliste();

                    storehouse.pokazdlugosclisty();


                    break;

                case 3:

                    System.out.println("Wprowadź indeks elementu do usunięcia");
                    storehouse.usunelement(scanner.nextInt());

                    break;


            }
        }
    }
}