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

        while (true){


            System.out.println("Co dalej?");

            System.out.println("1.Utwórz listę stanu magazynowego");

            System.out.println("2.Wybierz listę");

            System.out.println("3.Dodaj towar");

            System.out.println("4.Usuń element");

            System.out.println("5.Wyświetl przedmioty w magazynie i wolne miejsce");

            System.out.println("6.Zakończ");

            int choice = scanner.nextInt();


            switch (choice){
                case 1 :

                    System.out.println("Wprowadź grupę towarów - 'Spożywcze', 'Elektroniczne', 'zabawki'");
                    String grupename = scanner.next();
                    groups.addgroup(grupename);
                    System.out.println("Utworzono listę towarów grupy: " + grupename);

                    break;

                case 2:
                    System.out.println("Którą listę chcesz wybrać?");
                    groups.showgroup();
                    choicegroup = groups.choicegroup(scanner.next());
                    System.out.println(choicegroup.groupname);


                    break;


                case 3 :


                    System.out.println("Podaj nazwę towaru");
                    scanner.next();
                    System.out.println("Teraz podaj ilość");
                    scanner.next();
                    System.out.println("Teraz podaj cenę netto");
                    scanner.next();
                    System.out.println("Teraz podaj stawkę vat");
                    scanner.next();

                    break;

                case 4 :
                    break;

                case 5 :
                    break;

                case 6 :
                    break;






            }











        }



    }
}
