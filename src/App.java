import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número: ");
        final int number = sc.nextInt();

        System.out.println("Tabela de multiplicação de " + number);
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + number + " = " + (i * number));
        }
    }
}
