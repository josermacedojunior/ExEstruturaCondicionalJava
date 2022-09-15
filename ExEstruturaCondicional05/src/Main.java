import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double cod, num, preco, ptotal;
        System.out.print("Digite o código do item: ");
        cod = sc.nextDouble();
        System.out.print("Digite a quantidade de itens: ");
        num = sc.nextDouble();
        if (cod == 1) {
            preco = 4;
            ptotal = num * preco;
        } else if (cod == 2) {
            preco = 4.5;
            ptotal = num * preco;

        } else if (cod == 3) {
            preco = 5;
            ptotal = num * preco;
        } else if (cod == 4) {
            preco = 2;
            ptotal = num * preco;
        }
        else {
            preco = 1.50;
            ptotal = num * preco;
        }
        System.out.printf("TOTAL: R$%.2f%n", ptotal);
    }
}