import java.util.Scanner;
public class Atividade9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[6];
        int[] B = new int[6];
        int[] C = new int[6];
        int intersecoes  = 0;
        System.out.println("Digite 6 números: ");
        for(int i = 0; i < 6; i++){
            A[i] = scanner.nextInt();
        }
        System.out.println("Digite 6 números: ");
        for(int i = 0; i < 6; i++){
            B[i] = scanner.nextInt();
        }
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                if  (A[i] == B[j]){
                    boolean repetido = false;
                    for(int m = 0; m < intersecoes; m++){
                        if (C[m] == A[i]){
                            repetido = true;
                            break;
                        }
                    }
                    if (!repetido){
                        C[intersecoes] = A[i];
                        intersecoes++;
                    }
                }
            }
        }
        System.out.println("Números que estão nos dois vetores:");
        for(int i = 0; i < intersecoes; i++){
            System.out.println(C[i] + "  ");
        }
        scanner.close();
    }
}
