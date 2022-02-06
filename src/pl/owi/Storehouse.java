package pl.owi;

import java.util.ArrayList;
import pl.owi.ProductPC;

public class Storehouse {


    ArrayList<ProductPC> itemlist;
    String storename;
    int storagesize = 100;
    int storagecapacity;
    int itemnumber;


    Storehouse(int storagesize){
        this.itemnumber = 0;
        this.itemlist = new ArrayList<ProductPC>();
        this.storagecapacity = storagesize;
    }

    public void additem(String itemname){
        this.itemlist.add(new ProductPC(itemname));

    }

    public void deleteitem(){

    }

    public String tostring(){
        return ("Przedmioty w magazynie: " + itemlist + "Ilość miejsca w magazynie: " + storagecapacity );

    }





}
