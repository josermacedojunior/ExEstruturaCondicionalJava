import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Digite um número: ");
        x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println("Par");

        }
        else {
            System.out.println("Ímpar");
        }

    }
}