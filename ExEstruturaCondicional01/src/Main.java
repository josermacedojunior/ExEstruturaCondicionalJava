import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Digite um número: ");
        x = sc.nextInt();
        if (x <= 0) {
            System.out.println("Não negativo");

        } else {
            System.out.println("Negativo");
        }
        sc.close();


    }
}