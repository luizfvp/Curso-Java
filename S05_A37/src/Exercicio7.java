import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Digite um valor decimal: ");
            double x = sc.nextDouble();
            System.out.println("Digite um segundo valor decimal: ");
            double y = sc.nextDouble();

            if (x>0 && y>0) {
                System.out.println("O valor está no eixo Q1");
            } else if (x<0 && y>0) {
                System.out.println("O valor está no eixo Q2");
            } else if (x<0 && y<0) {
                System.out.println("O valor está no eixo Q3");
            } else if (x>0 && y<0) {
                System.out.println("O valor está no eixo Q4");
            } else if (x==0) {
                System.out.println("O valor está no eixo Y");
            } else if (y==0) {
                System.out.println("O valor está no eixo X");
            } else {
                System.out.println("O valor está no eixo O");
            }

        sc.close();
    }

}
