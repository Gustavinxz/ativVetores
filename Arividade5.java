import java.util.Scanner;
public class Arividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[12];
        int soma = 0;

        System.out.println("Digite 12 números: ");
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Número " + (i + 1) + " : ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }

        double media = (double) soma / numeros.length;

       
       System.out.println("Média: " + media);
       
       System.out.println("Números acima da média:");
       for (int i = 0; i < numeros.length; i++) {
           if (numeros[i] > media) {
               System.out.println(numeros[i]);
           }
       }

       scanner.close();
   }
}