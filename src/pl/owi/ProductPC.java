package pl.owi;
import java.util.ArrayList;

public class ProductPC {

    public String nettoprice;

    public String itemname;

    private String[] group = {"food","electronics","toys"};
    String[] getGroup(){
        return this.group;
    }

    //jesli nie zadziała sprobuje group i vat zrobic na Arrayliscie

    private Integer[] vat = {23,8,5,0};
    Integer[] getVat(){
        return this.vat;
    }

    ProductPC(String itemname){
        this.itemname = itemname;


    }





}
