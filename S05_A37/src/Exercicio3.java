import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Digite um valor inteiro: ");
            int num1 = sc.nextInt();
            System.out.println("Digite outro valor inteiro: ");
            int num2 = sc.nextInt();

            if (num1%num2==0 || num2%num1==0) {
                System.out.println("Os números são multiplos.");
            } else {
                System.out.println("Os números não são multiplos.");
            }

        sc.close();
    }
}
