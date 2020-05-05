package Konstruktoryklas;

public class Main {

    public static void main(String[] args)
    {

Czlowiek Jan = new Czlowiek("Jan");

        System.out.println(Jan.imie);
        System.out.println(Czlowiek.liczebnosc);

        Czlowiek Adam = new Czlowiek();

        Adam.imie= "Jacek";

        System.out.println(Adam.imie);
        System.out.println(Czlowiek.liczebnosc);

    }
}
