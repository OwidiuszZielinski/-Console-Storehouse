package pl.owi;
import java.util.ArrayList;

public class ProductPC {

    private String nazwa;

    public ProductPC() {
    }
//wywolam w main pusty konstruktor i stworze settery dla wszystkich pól nastepnie wywolam je uzywajac wartosci ze skanera
    //
    public ProductPC(String nazwa, String grupa, Integer cenanetto, Integer vat, Integer ilosc) {
        this.nazwa = nazwa;
        this.grupa = grupa;
        this.cenanetto = cenanetto;
        this.vat = vat;
        this.ilosc = Integer.valueOf(ilosc);
    }


    String getNazwa() {
        return this.nazwa;

    }
    public void setNazwa(String nazwa){
        this.nazwa = nazwa;
        //this zawsze odwoluje sie do pola w obiekcie po = jest parametr
    }

    private String grupa;

    String getGrupa() {
        return this.grupa;
    }

    private Integer cenanetto;

    Integer getCenanetto() {
        return this.cenanetto;
    }

    private Integer vat;

    Integer getVat() {
        return this.vat;
    }

    private Integer ilosc;

    Integer getIlosc() {
        return this.ilosc;
    }



    }
