package pl.owi;

import java.util.ArrayList;
import pl.owi.ProductPC;

public class Storehouse {


    ArrayList<ProductPC> itemlist;
    public String storename;
    int storagesize;
    int storagecapacity;
    int itemnumber;
    public String groupname;

    Storehouse(int st0oragesize){

        this.itemlist = new ArrayList<ProductPC>();
        this.storagesize = storagesize;
    }



    public void additem(String nettoprice,String itemname,String group,int vat){
        this.itemlist.add(new ProductPC(nettoprice,itemname,group,vat));

    }

    public void deleteitem(){

    }

    public String tostring(){
        return ("Przedmioty w magazynie: " + itemlist + "Ilość miejsca w magazynie: " + storagecapacity );

    }





}
