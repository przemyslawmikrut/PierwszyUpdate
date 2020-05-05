package GetteryISettery;

public class Uczen {

    /// public/private -> zasieg prywatny jest dostepny tylko na rzecz klasy w ktorej sie znajduje

    private String nazwisko;

    String getNazwisko()
    {
        return "Nazwisko: " + this.nazwisko;
    }

    //// void bo ma setowac, a nie zwracac

    void setNazwisko(String nazwisko)
    {
        //// jesli if sie nie spelni, nic sie nie zasetuje
///// ta petla if - logika biznesowa - czyli warunki/ograniczenia


        if(nazwisko.length()>=2){

            this.nazwisko = nazwisko;
        }

    }
    private int ocena;

    int getOcena()
    {
        return this.ocena;

    }

    void setOcena(int ocena){

        if(ocena>=1 && ocena<=6)
        {
            this.ocena = ocena;
        }

    }
}
