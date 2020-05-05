import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {

        ///////lekacja 2
/////zad1
 /*       int z1 = 15, z2 = 5;

        System.out.println(z1+z2);
        System.out.println(z1-z2);
        System.out.println(z1*z2);
        System.out.println(z1/z2);
        System.out.println(z1%z2);
*/
////zad2
        /*
  char letter = 'a';
  letter++;
        System.out.println(letter);
*/

        ////zad3
/*
        double liczba = 10.123456789;
        for(int i=0; i<10; i++)
        {
        liczba++;
        }
        System.out.println(liczba);
  */

///zad4
  /*     String tekst="Wynikiem dodawania liczby 2 i 2 jest";
int liczba = 2;

liczba = liczba +2;

        System.out.println(tekst + " " + liczba);

*/

  /*
  double r = 47;

  double obwod = 2 * Math.PI * r;
  double pole = Math.PI*r*r;

        System.out.println(obwod);
        System.out.println(pole);
*/

        ////Lekcja 3


        ///zad 3
        /*
char a = 'a';
        do {
            System.out.println(a);
            a++;


        }
        while(a!='z');
        System.out.println(a);
        */

        ///zad 1
/*
        char gwiazda = '*';
        int wysokosc = 10;

        for (int a = 0; a < wysokosc; a++) {
            for (int b = 0; b < wysokosc; b++) {
                if (b <= a) {
                    System.out.print(gwiazda);
                }
            }
            System.out.println();
*/

/////zad 4
/*
        int tab[] = new int[10];
        int a= 11;

        for(int i=0; i<10; i++)
        {

        tab[i]= a * (i+1);
            System.out.println(tab[i]);
        }

*/

/*
        Scanner scanner = new Scanner (System.in);

        int liczba1;
        System.out.println("Podaj liczbe 1");

        liczba1 = scanner.nextInt();


        int liczba2;
        System.out.println("Podaj liczbe 2");

        liczba2 = scanner.nextInt();


        int liczba3;
        System.out.println("Podaj liczbe 3");

        liczba3 = scanner.nextInt();



        if(liczba1>liczba2&&liczba1>liczba3&&liczba2>liczba3) {
            System.out.print(liczba1);
            System.out.print(liczba2);
            System.out.print(liczba3);
        }
        else if(liczba1>liczba2&&liczba1>liczba3&&liczba3>liczba2) {
            System.out.print(liczba1);
            System.out.print(liczba3);
            System.out.print(liczba2);
        }

        else if(liczba2>liczba1&&liczba2>liczba3&&liczba1>liczba3) {
            System.out.print(liczba2);

            System.out.print(liczba1);
            System.out.print(liczba3);
        }
        else if(liczba2>liczba1&&liczba2>liczba3&&liczba3>liczba1) {
            System.out.print(liczba2);
            System.out.print(liczba3);
            System.out.print(liczba1);
        }
        else if(liczba3>liczba1&&liczba3>liczba2&&liczba1>2) {
            System.out.print(liczba3);
            System.out.print(liczba1);
            System.out.print(liczba2);
        }
        else
        {
            System.out.print(liczba3);
            System.out.print(liczba2);
            System.out.print(liczba1);
        }

        */


//// zad 4
/*
        Scanner scanner = new Scanner(System.in);
        String firstName;

        System.out.println("What is your first name?");

                firstName = scanner.nextLine();

        System.out.println("What is your second name?");

        String secondName;

        secondName = scanner.nextLine();

        int phoneNumber;

        System.out.println("What is your mobile phone numer?");

        phoneNumber = scanner.nextInt();

        String company;

        System.out.println("Where do you work?");



        company = scanner.next();


        int age;

        System.out.println("What is the year of your birth?");

        age = scanner.nextInt();


        age = 2020 - age;

        System.out.println( "Name " + firstName + "  " + secondName);
        System.out.println("Mobile phone: " + phoneNumber);
        System.out.println("Company " + company);
        System.out.println("Age: " + age);

*/

Scanner scanner = new Scanner(System.in);

int liczba;

        System.out.println("Podaj liczbe ");

        liczba = scanner.nextInt();

        System.out.println("Podaj tekst ");

        String tekst = scanner.next();


        int decyzja;

        System.out.println("Drukowac czy nie ? 1 - tak , 2 - nie");

        decyzja = scanner.nextInt();


        if(decyzja == 1)
        {
            for (int i = 0; i<liczba; i++) {
                System.out.println(liczba + tekst);
            }
        }
        else if(decyzja == 2)
        {
            System.out.println(" Nie to nie !");
        }

        else
            System.out.println("Miało być 1 lub 2...");









    }
}
