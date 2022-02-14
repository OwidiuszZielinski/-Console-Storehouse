package pl.owi;
import pl.owi.Main;
import pl.owi.Storehouse;
import pl.owi.Storehousefactory;

import java.io.*;
import java.util.ArrayList;


public class CsvService {

    Storehouse storehouse = Storehousefactory.getInstance();


    public void writeToFile() throws IOException {

        File file = new File("Strorehouse.csv");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);

        System.out.println(storehouse.listatowarow.size());

        for (ProductPC x : storehouse.listatowarow) {

            bw.write(x.getNazwa() + ","  + x.getGrupa()+ "," + x.getCenanetto()+ "," + x.getVat()+ "," + x.getIlosc());

            bw.newLine();
            System.out.println("Zapisaono w pliku CSV");
        }

        bw.close();
    }




        public void readfromcsv () throws IOException
        {
            File file = new File("Strorehouse.csv");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String data;
            while ((data = br.readLine()) !=null)

            {
            String[] pobrane = data.split(",");
            Storehouse storehouse = Storehousefactory.getInstance();
            ProductPC nowy = new ProductPC();
            storehouse.dodajelement(nowy);
            System.out.println("Wczytano wartości listy z pliku CSV");
            }

        }
    }