package pl.owi;
import java.util.ArrayList;

public class ProductPC {


    private String nameofadditem;
    String getNameofadditem(){
        return this.nameofadditem;
    }
    void setNameofadditem(String nameofadditem){
        this.nameofadditem = nameofadditem;
    }



    private String itemquantity;
    String getItemquantity(){
        return this.itemquantity;
    }
    void setItemquantity(String itemquantity){
        this.itemquantity = itemquantity;
    }



    private int storagespace = 10000;
    int getStoragespace(){
        return this.storagespace;
    }
    void setStoragespace(int storagespace){
        this.storagespace = storagespace;
    }



    private String itemsgroup;
    String getItemsgroup(){
        return this.itemsgroup;
    }
    void setItemsgroup(String itemsgroup){
        this.itemsgroup = itemsgroup;
    }



    private int[] vat =  {23,15,8,5,0};

    public int[] getVat() {
        return this.vat;
    }
    void setVat(int vat){

    }


    private String nettoprice;
    String getNettoprice(){
        return this.nettoprice;
    }
    void setNettoprice(String nettoprice){
        this.nettoprice = nettoprice;
    }

    //konstruktor
    public ProductPC(String nameofadditem,String itemquantity,Integer nettoprice,Integer[] vat) {
        this.nameofadditem = getNameofadditem();
        this.itemquantity = getItemquantity();
        this.nettoprice = getNettoprice();
        this.vat = getVat();


    }
}


