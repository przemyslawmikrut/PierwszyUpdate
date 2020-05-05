package KlasyiObiekty;

public class Main {
    public static void main(String[] args)
    {


Zwierze kot = new Zwierze();
kot.glos = "Meeeow";
kot.imie = "Filemon";
kot.przedstawSie();
kot.dajGlos(3);

Zwierze pies = new Zwierze();

pies.glos = "Hau hau";
pies.imie = "Reksio";

pies.przedstawSie();
pies.dajGlos(2);
    }
}
