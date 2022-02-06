package pl.owi;
import java.util.ArrayList;

public class ProductPC {

    private String nettoprice;

    public ProductPC(String groupname) {
    }

    String getNettoprice() {
        return this.nettoprice;
    }
    void setNettoprice(String nettoprice){
        this.nettoprice = nettoprice;
    }
    public String itemname;

    public String group;
    String getGroupe() {
        return this.group;
    }
    void setGroup(String group){
        this.group = group;
    }
    public  int vat;


    ProductPC(String nettoprice,String itemname,String group,int vat){

        this.nettoprice = nettoprice;
        this.itemname = itemname;
        this.group = group;
        this.vat = vat;



    }


}
