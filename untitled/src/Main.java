// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*
        int numero = 0;
        for (int i = 1; i < 100; i++) {


            if (i % 2 == 0) {

            } else {
                numero = numero + i++;
                System.out.println(i);

            }

        }
        System.out.println(numero);


        int a = 0;
        while (a < 20) {
            if (a % 5 == 0) {
                System.out.println("");
            }
            a++;
            System.out.print(a);
        }


        for (int b = 0; b < 20; ) {
            if (b % 5 == 0) {
                System.out.println("");
            }
            b++;
            System.out.print(b);
        }


        int i = 0;
        while (i < -0) {
            i++;
        }


        for (double k = 0.1; k != 1.0; k += 0.1) {
            System.out.println(k);
        }

        int n = 1;

        switch (n) {
            case 1:
                System.out.println("The number is 1");
                break;
            case 2:
                System.out.println("The number is 2");
                break;
            default:
                System.out.println("The number is not 1 or 2");
                break;
        }

        int j = 1;
        while (j <= 10) {
            System.out.println(j++);
        }

        for(int z = 1; z >= 100; z++ ){
            System.out.println(z);
        }

        for(int z = 1; z >= 19; z += 2 ){
            System.out.println(z);
        }

        int couter = 2;

        do
        {
            System.out.println(couter);
            couter += 2;
        }while (couter <= 100);


         */

        int i = 1, j = 2, k = 3, m = 2;

        System.out.println(i == 1);
        System.out.println(j == 3);

        System.out.println((i >= 1) && (j < 4));
        System.out.println((m <= 99) & (k >= m));

        System.out.println((j >= 1) || (k == m));
        System.out.println((k + m < j) | (3 - j >= k));

        System.out.println(!(k > m));
    }
}