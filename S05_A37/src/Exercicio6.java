import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Digite um valor inteiro: ");
            int num = sc.nextInt();

            if (num>=0 && num<=25) {
                System.out.println("O valor está entre 0 e 25.");
            } else if (num>=26 && num<=50) {
                System.out.println("O valor está entre 26 e 50.");
            } else if (num>=51 && num<=75) {
                System.out.println("O valor está entre 51 e 75.");
            } else if (num>=76 && num<=100) {
                System.out.println("O valor está entre 76 e 100.");
            } else {
                System.out.println("O valor está fora do intervalo.");
            }

        sc.close();
    }

}
