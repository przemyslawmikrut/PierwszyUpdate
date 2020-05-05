import java.util.Scanner;

public class tablicaimion {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String[] a = new String[5];

for(int i=0; i < a.length; i++) {
    System.out.println("Podaj imię: ");
    a[i] = scanner.nextLine();
}
for(int i=0; i < a.length; i++)

    System.out.println("Cześć " + a[i]);





    }
}

