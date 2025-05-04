import java.util.Scanner;
public class Atividade6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Digite 10 números: ");
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Digite o número que vc deseja remover: ");
        int remover = scanner.nextInt();

        int posicao = -1;
        for (int i = 0; i < 10; i++) {
            if (numeros[i] == remover) {
                posicao = i;
                break;
            }
        }
        if (posicao == -1){
            System.out.println("Número não encontrado.");
        }else {
            System.out.println("Vetor depois de remover o número: ");
            for(int i = 0; i < 10; i++){
                if (i != posicao){
                    System.out.println(numeros[i] + " ");
                }
            }
        }
        scanner.close();
    }
}
