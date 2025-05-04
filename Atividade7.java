import java.util.Scanner;
public class Atividade7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[15];

        System.out.println("Digite 15 números inteiros: ");
        for(int i  = 0; i < 15; i++){
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Digite o número que deseja contar: ");
        int alvo = scanner.nextInt();

        int contador = 0;
        for(int i = 0; i < 15; i++){
            if(numeros[i] == alvo){
                contador++;
            }
        }
        System.out.println("O número " + alvo + " aparece " + contador + " no vetor");

        scanner.close();
    }
}
