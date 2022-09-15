import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int hi, hf, dt;
        System.out.println("Digite a hora de inicio da partida: ");
        hi = sc.nextInt();
        System.out.println("Digite a hora do fim da partida: ");
        hf = sc.nextInt();
        dt = hi - hf;
        if (hi < hf) {
            dt = hf - hi;
        } else {
            dt = 24 - hi + hf;
        }
        System.out.println("O jogo durou: " + dt + "Hora(s).");

        sc.close();
    }
}