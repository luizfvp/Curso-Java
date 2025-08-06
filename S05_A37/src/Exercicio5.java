import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Codigo      Especificação       Preço");
            System.out.println("1           Cachorro Quente     R$ 4,00");
            System.out.println("2           X-Salada            R$ 4,50");
            System.out.println("3           X-Bacon             R$ 5,00");
            System.out.println("4           Torrada simples     R$ 2,00");
            System.out.println("5           Refrigerante        R$ 1,50");
            
            System.out.println("\nDigite o codigo do produto que deseja: ");
            int codigo = sc.nextInt();
            System.out.println("Digite a quantidade desejada: ");
            int quant = sc.nextInt();

            double precoTotal = 0;

            if (codigo == 1) {
                precoTotal = quant * 4;
                System.out.printf("O preço total é: R$ %.2f", precoTotal);
            } else if (codigo == 2) {
                precoTotal = quant * 4.5;
                System.out.printf("O preço total é: R$ %.2f", precoTotal);
            } else if (codigo == 3) {
                precoTotal = quant * 5;
                System.out.printf("O preço total é: R$ %.2f", precoTotal);
            } else if (codigo == 4) {
                precoTotal = quant * 2;
                System.out.printf("O preço total é: R$ %.2f", precoTotal);
            } else if (codigo == 5) {
                precoTotal = quant * 1.5;
                System.out.printf("O preço total é: R$ %.2f", precoTotal);
            } else {
                System.out.println("Código inválido!");
            }
            
        sc.close();
    }
}
