package pl.owi;
import java.util.ArrayList;

public class ProductPC {

    private String nazwa;

    //Prywatne pole klasy typu String

    public ProductPC() {

    }
    //Pusty konstuktor do wywołania w main ?


    public ProductPC(String nazwa, String grupa, Integer cenanetto, Integer vat, Integer ilosc) {
        this.nazwa = nazwa;
        this.grupa = grupa;
        this.cenanetto = cenanetto;
        this.vat = vat;
        this.ilosc = Integer.valueOf(ilosc);
    }
    // Przeciazony konstruktor , uzwany byl wczesniej do tworzenia obiektow bez getterow i setterów.




    String getNazwa() {
        return this.nazwa;

    }
    //Tworze getter przez podanie typu zmiennej i kluczowe słówko get nastepnie z duzej litery parametr

    public void setNazwa(String nazwa){

    //Tworze setter jako metoda do ustanawiania wartosci zmiennej w parametrze podajac typ zmiennej

        this.nazwa = nazwa;

        //this zawsze odwoluje sie do pola w obiekcie po = jest parametr
    }

    private String grupa;
    //jw. do kazdej zmiennej getter/setter
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
