import java.util.Scanner;

public class bomba {
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
int a;
        System.out.println("Podaj czas : ");

        a=scanner.nextInt();
/*
        for(int i=a; i>=0; i--)
        {

            System.out.println(a);
            a--;
        }
*/

/*
        do{
            System.out.println(a);
            a--;
        }
        while(a>=0);

*/

while(a>=0)
{
    System.out.println(a);
    a--;
}

    }
}
