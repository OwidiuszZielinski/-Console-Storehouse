package pl.owi;
import pl.owi.Main;
import pl.owi.Storehouse;
import pl.owi.Storehousefactory;

import java.io.*;
import java.util.ArrayList;

//Klasa tworzaca,zapisujaca,odczytujaca plik CSV z danymi z tablicy

public class CsvService {

    Storehouse storehouse = Storehousefactory.getInstance();
    // tworzymy obiekt klasy Storehouse o nazwie storehouse do ktorego przypisujemy metode getinstance(singleton) stworzony w fabryce

    public void writeToFile() throws IOException {

        //metoda pozwalajaca na zapisanie danych do z listy do pliku csv oraz tworzy plik csv wyjatek IOExc wyjatku uzywamy
        //do zapisywania i odczytu pliku


        File file = new File("Strorehouse.csv");

        // tworzymy obiekt klasy File o nazwie file oraz wprowadzamy nazwe tworzonego pliku wraz z rozszerzeniem tzp pathname

        FileWriter fw = new FileWriter(file);

        // tworzymy obiekt zapisujacy o nazwie fw ktory dziedziczy nazwe pliku na ktorym bedzie operowac
        // klasa pozwala na dostep do pliku znak po znaku
        BufferedWriter bw = new BufferedWriter(fw);

        // tworzymy obiekt klasy BufferedWriter ktory dziedziczy operacje po obiekcie zapisujacym fw
        //klasa pozwala na dostep do pliku
        System.out.println(storehouse.listatowarow.size());
        //stworzylem wyswietlenie wielkosci listy towarow aby sprawdzic czy element zostal wrzucony

        for (ProductPC x : storehouse.listatowarow) {

        //petla for dla pojedynczej zmiennej wyciagnietej z kolekcji dlaczego storehouse.listatowarow??????
        //obiekt storehouse i callujemy do listytowarow bo tak nazwana jest kolekcja z moim elementem?

            bw.write(x.getNazwa() + ","  + x.getGrupa()+ "," + x.getCenanetto()+ "," + x.getVat()+ "," + x.getIlosc());
        //wzywamy obiekt o nazwie bw i zapisujemy zmienna wyciagnieta i jej get.wartosc przypisana podczas dodawania do kolekji
            //nastepnie oddzielamy przecinkiem
            bw.newLine();
            //wywolujemy metode pisania nowej linijki
            System.out.println("Zapisaono w pliku CSV");
        }

        bw.close();
        //zamykamy dzialanie bufferedwritera
    }




        public void readfromcsv () throws IOException

        {
            File file = new File("Strorehouse.csv");
            //nazwa pliku na ktorym bedziemy operowac
            FileReader fr = new FileReader(file);
            //obiekt klasy FileReader
            BufferedReader br = new BufferedReader(fr);
            String data;
            while ((data = br.readLine()) !=null)
            {

            String[] pobrane = data.split(",");
                System.out.println(pobrane[0]);
            ProductPC nowy = new ProductPC(pobrane[0],pobrane[1],Integer.parseInt(pobrane[2]),Integer.parseInt(pobrane[3]),
                    Integer.parseInt(pobrane[4]));

            storehouse.dodajelement(nowy);
            System.out.println("Wczytano wartości listy z pliku CSV");
            }

        }
    }