import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                int a, b;
                System.out.println("Digite um numero: ");
                a = sc.nextInt();

                System.out.println("Digite outro numero: ");
                b = sc.nextInt();

                if (a % b == 0 || b % a == 0) {
                    System.out.println("Sao multiplos");

                }
                else {
                    System.out.println("Nao sao multiplos");
                }
                sc.close();



            }
        }
    }
}