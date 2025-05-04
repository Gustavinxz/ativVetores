import java.util.Scanner;
public class Atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Digite 10 números: ");
        for(int i = 0; i < 10; i++){
            numeros[i] = scanner.nextInt();
        }
        for(int i = 0; i < 9; i++){
            for (int j = 0; j < 9 - i; j++){
                if (numeros[j] > numeros[j + 1]){
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1 ] = temp;
                }
            }
        }
        System.out.println("Os números ordenados são: ");
        for (int i = 0; i < 10; i++){
            System.out.print(numeros[i] + " ");
        }
        scanner.close();
    }
}
