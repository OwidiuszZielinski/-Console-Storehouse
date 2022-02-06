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
        this.storagesize = storagesize;
        this.itemlist = new ArrayList<ProductPC>();

    }

    public void additem(String itemname,String group){
        this.itemlist.add(new ProductPC(itemname,group));

    }

    public void deleteitem(){

    }

    public String tostring(){
        return ("Przedmioty w magazynie: " + itemlist + "Ilość miejsca w magazynie: " + storagecapacity );

    }





}
