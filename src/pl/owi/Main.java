package pl.owi;

import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {



        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        ///tworzymy obiek klasy Scanner o nazwie skanner ktory pozwoli skanowac wprowadzanie zmiennych do kodu z konsoli
        //uzywamy metody useDelimiter ("\n") aby mozliwe bylo wprowadzenie wartosci z uzyciem spacji

        System.out.println("Program do obługi magazynu");

        System.out.println("Wybierz działanie");


        Storehouse storehouse = Storehousefactory.getInstance();
        CsvService csv = new CsvService();

        //Stworzyłem obiekt Storehouse nazwany storehouse i przypisujemy mu pojedyncza instacje z klasy storehousefactory


        while (true) {
        //petla do wyswietlania menu

            System.out.println("1.Dodaj towar");

            System.out.println("2.Wyświetl przedmioty w magazynie i wolne miejsce");

            System.out.println("3.Usuń element");

            System.out.println("4.Oblicz cenę brutto");

            System.out.println("5.Pokaż długość listy");

            System.out.println("6.Zapisz do pliku CSV");

            System.out.println("7.Załaduj z pliku CSV");

            System.out.println("8.Zakończ program");

            int choice = scanner.nextInt();


            switch (choice) {


                case 1:

                    System.out.println("Wprowadź  :");

                    System.out.print("Nazwa towaru : ");
                    ProductPC temp = new ProductPC();
                    //stworzylem obiekt o nazwie temp ktoremu przypiszemy nizej pewne wartosci parametrow
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
                    //na koncu wywolujemy metode dodajelement aby opisany obiekt zostal zapisana w kolekji

                    break;


                case 2:

                    storehouse.pokazliste();
                    storehouse.pokazdlugosclisty();
                    System.out.println("Wolne miejsca true/false");

                    break;

                case 3:

                    System.out.println("Wprowadź indeks elementu do usunięcia");
                    storehouse.usunelement(scanner.nextInt());

                    break;

                case 4:

                    System.out.println("Podaj indeks towaru");
                    storehouse.pokazcenebrutto(scanner.nextInt());

                    break;

                case 5:

                    System.out.println("Ilość wolnego miejsca : ");
                    storehouse.pokazdlugosclisty();
                    System.out.println("Miejsc/a");

                    break;

                case 6:

                    csv.writeToFile();

                    break;

                case 7:

                    csv.readfromcsv();

                    break;


                case 8:

                    System.out.println("Program zakończony");
                    System.exit(0);

                    break;


            }
        }
    }
}


/// Stworzyc 2 metody pozwalajace na zapisywanie listytowarow do pliku csv i odczytujace z pliku csv
/// rozszerzenie csv - comma separated file

/// 2 metody ktorwa laduje i zapisuje do pliku csv operacje na stringach
/// zastosuj split po kropce