public class rzutowanie {
    public static void main(String[] args)
    {
        ///// rzutowanie niejawne -> rzutujemy do wiekszego, nie ma ryzyka utraty danych
        short a = 25;
        int b = a;
        System.out.println(b);
        //// rzutowanie jawne -< do mniejszego rzutujemy wiekszy, istnieje ryzyko utraty danych np.

        int c = Integer.MAX_VALUE;
        short d = (short) c;

        System.out.println(d);

////// string moze przechowywac liczby

        int cyfra = 7;

        String liczba = Integer.toString(cyfra);

        int cyferka = Integer.parseInt(liczba);

        System.out.println(cyferka + 2);

    }
}
