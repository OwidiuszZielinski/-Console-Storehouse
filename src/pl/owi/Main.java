package pl.owi;

import java.util.Scanner;
import pl.owi.Storehouse;
import java.util.ArrayList;
import pl.owi.Groups;
public class Main {

    public static void main(String[] args) {

        Storehouse choicegroup = null;

        Groups groups = new Groups();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Program do obługi magazynu");

        System.out.println("Wybierz działanie");

        while (true) {


            //System.out.println("Co dalej?");

            System.out.println("1.Utwórz grupę przedmiotów w magazynie");

            System.out.println("2.Wybierz grupę");

            System.out.println("3.Dodaj towar");

            System.out.println("4.Wyświetl przedmioty w magazynie i wolne miejsce");

            System.out.println("5.Usuń element");

            System.out.println("6.Zakończ");

            int choice = scanner.nextInt();


            switch (choice) {
                case 1:

                    System.out.println("Wprowadź grupę towarów - 'Spożywcze', 'Elektroniczne', 'Zabawki'" +
                            "  " + "Następnie wprowadź ilość miejsc magazynowych");
                    String grupename = scanner.next();
                    int storagecapacity = scanner.nextInt();

                    System.out.println("Utworzono grupę towarów : " + grupename + " O wielkości: " + storagecapacity);

                    break;

                case 2:

                    System.out.println("Wpisz grupę którą chcesz wybrać?");


                    break;


                case 3:


                    System.out.println("Podaj nazwę towaru");

                    System.out.println("Teraz podaj ilość towaru");

                    System.out.println("Teraz podaj cenę netto");


                    System.out.println("Teraz podaj stawkę netto - 23%, 8%, 5%, 0% ");

                    System.out.println("Potwierdzam wprowadzenie pozycji do magazynu");


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
