package pl.owi;
import java.util.ArrayList;

public class ProductPC {

    private String nazwa;

    // po co ten null?tworzymy singleton czyli zamykamy liste w private

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




    //tworze gettery i settery

    String getNazwa() {
        return this.nazwa;

    }
    public void setNazwa(String nazwa){
        this.nazwa = nazwa;
        //this zawsze odwoluje sie do pola w obiekcie po = jest parametr
    }

    private String grupa;

    String getGrupa()
    {
        return this.grupa;
    }
    public void setGrupa(String grupa)
    {
        this.grupa = grupa;

    }

    private Integer cenanetto;

    Integer getCenanetto()
    {
        return this.cenanetto;
    }
    public void setCenanetto(Integer cenanetto){
        this.cenanetto = cenanetto;

    }
    private Integer vat;

    Integer getVat() {
        return this.vat;
    }
    public void setVat(Integer vat)
    {
        this.vat = vat;

    }
    private Integer ilosc;

    Integer getIlosc()
    {
        return this.ilosc;
    }
    public void setIlosc(Integer ilosc)
    {
        this.ilosc = ilosc;

    }


    }
