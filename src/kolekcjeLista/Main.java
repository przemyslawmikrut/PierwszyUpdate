package kolekcjeLista;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {

        Animal kot1 = new Animal("Rudy");
        Animal kot2 = new Animal("Bury");
        Animal kot3 = new Animal("Biały");

        ArrayList lista = new ArrayList();

        lista.add(kot1);
        lista.add(kot2);
        lista.add(kot3);


        System.out.println("---------");
        //// iteracja po "lista"

        for(Object k : lista){

            System.out.println(((Animal)k).imie);

        }
        System.out.println("---------");

//// pierwszy element kolekcji jest 0...
        System.out.println(((Animal)lista.get(0)).imie);
//// rozmiar listy
        System.out.println(lista.size());
/// sprawdzanie czy obiekt znajduje sie na liscie
        System.out.println(lista.contains(kot1));

        lista.remove(kot2);
        System.out.println("------");
        for(Object l : lista)
        {

            System.out.println(((Animal)l).imie);
        }

        System.out.println("------");

/// usuwanie po indeksie
        lista.remove(1);

        System.out.println(lista.size());

        lista.clear();

        System.out.println(lista.size());


  //////////////////
  ////////////////  Lista generyczna - bardziej właściwa
  ////////////////
/// nawiasy ostre zawsze do typów generycznych
        ////  w nawiasach podajemy typ jaki ma przechowywac

ArrayList<Animal> listaG = new ArrayList<Animal>();
////metody takie same jak w poprzednim arraylist
listaG.add(kot1);
listaG.add(kot2);
listaG.add(kot3);

for(Animal m : listaG){

    System.out.println(m.imie);

}
        System.out.println(listaG.get(0).imie);

    }
}
