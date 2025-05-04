import java.util.Scanner;
public class Atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[15];

        System.out.println("Digite 15 números: ");
        for (int i = 0; i < numeros.length; i++){
            System.out.println("número " + (i + 1) + " : " );
            numeros[i] = scanner.nextInt();
        }
        int maior = numeros[0];
        int posicao = 0;

        for (int i = 1 ; i < numeros.length; i++){
            if (numeros[i] > maior){
                maior = numeros[i];
                posicao = i;
            }
        }
        System.out.println("O maior valor é : " + maior);
        System.out.println("A posição é: " + posicao);

        scanner.close();
    }
}
