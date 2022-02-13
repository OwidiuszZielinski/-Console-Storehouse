package pl.owi;
import pl.owi.Main;
import pl.owi.Storehouse;
import pl.owi.Storehousefactory;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class CsvService {

    Storehouse storehouse = Storehousefactory.getInstance();


    public void writeToFile() throws IOException {

        File file = new File("Strorehouse.csv");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        System.out.println("GRYKA PAŁA");

        System.out.println(storehouse.listatowarow.size());

        for (ProductPC x : storehouse.listatowarow) {

            bw.write(x.getNazwa() + x.getGrupa() + x.getCenanetto() + x.getVat() + x.getIlosc());

            bw.newLine();
            System.out.println("Zapisaono w pliku CSV");
        }

        bw.close();
    }




        public void readfromcsv () {


        }
    }