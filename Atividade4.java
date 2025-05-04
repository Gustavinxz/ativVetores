import java.util.Scanner;
public class Atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[8];

        System.out.println("Digite 8 números: ");
        for(int i = 0; i < numeros.length; i++){
            System.out.println("número " +  (i + 1) + " : ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Vetor na ordem inversa");
        for(int i = numeros.length - 1; i >= 0; i--){
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
}
