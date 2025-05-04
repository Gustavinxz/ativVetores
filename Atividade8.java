import java.util.Scanner;
public class Atividade8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[10];

        System.out.println("Digite 5 números: ");
        for(int i = 0; i < 5; i++){
            
            A[i] = scanner.nextInt();
        }

        System.out.println("Digite 5 números: ");
        for(int i = 0; i < 5; i++){
            
            B[i] = scanner.nextInt();
        }
        System.out.println("A combinação dos números é:  ");
        for(int i = 0; i < 5; i++){
            C[i] = A[i];
            C[i + 5] = B[i];
        }

        for(int i = 0; i < 10; i++){
            System.out.println(C[i] + " ");
        }

        scanner.close();
    }
}
