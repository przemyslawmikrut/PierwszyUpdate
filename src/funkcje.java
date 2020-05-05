public class funkcje {

    public static void main(String[] args) {
        /// rozne przeciazenia tej samej funkcji/metody
     /*   System.out.println(dodaj());
        System.out.println(dodaj(5));
        System.out.println(dodaj(5, 6));

    }
    static int dodaj()
    {
        return 1;
    }static int dodaj(int x)
    {
        return ++x;
    }
    static int dodaj(int x, int y)
    {
        return x+y;
    }

 */

     //// aby zmienna y byla rowna 10 trzeba uzyc int zamiast void, oraz w metodzie zmien dodac return x, a nastepnie przypisac do y=zmien(y);
/*
     int y = 5;
     zmien(y);
        System.out.println(y);

    }

     public static void zmien(int x)
        {
        x+=5;
            System.out.println("Metoda: " + x);
        }
*/

//// w typach zlozonych np. tablice  - kopiuje wartość do referencji, prosty - kopiuje tylko wartośc

int[] y = {5};

        zmien(y);
        System.out.println(y[0]);

    }

    public static void zmien(int[] x)
    {
        x[0] += 5;
        System.out.println("Metoda: " + x[0]);

    }





}