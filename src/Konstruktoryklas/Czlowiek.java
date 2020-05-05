package Konstruktoryklas;

public class Czlowiek {

    ////metoda(konstruktor) musi sie nazywac tak samo jak klasa
/// dwa konstruktory musza miec rozna ilosc arg. lub rozny typ
    Czlowiek(String imie)
    {
liczebnosc++;

this.imie = imie;

    }
    Czlowiek()
    {
        liczebnosc++;


    }
    String imie;
    /// static aby odnosila sie do calej klasy, a nie do jednego obiektu
    static int liczebnosc = 0;




}
