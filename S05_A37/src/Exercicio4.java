import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Digite a hora inicial do jogo: ");
            int horaInicial = sc.nextInt();
            System.out.println("Digite a hora final do jogo: ");
            int horaFinal = sc.nextInt();

            int duracaoTotal = 0;

            if (horaFinal < horaInicial) {
                duracaoTotal = 24 - horaInicial + horaFinal;
                System.out.println("O jogo durou " + duracaoTotal + " horas");
            } else {
                duracaoTotal = horaFinal - horaInicial;
                System.out.println("O jogo durou " + duracaoTotal + " horas");
            } 

        sc.close();
    }
}
