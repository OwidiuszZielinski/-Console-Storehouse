package pl.owi;
import java.util.ArrayList;

public class ProductPC {

    public String nettoprice;

    public String itemname;
    public String group;



    //jesli nie zadziała sprobuje group i vat zrobic na Arrayliscie

    private Integer[] vat = {23,8,5,0};
    Integer[] getVat(){
        return this.vat;
    }
    void setVat(Integer[] vat){
        this.vat = vat;
        
    }
    ProductPC(String itemname,String group){

        this.itemname = itemname;


    }





}
