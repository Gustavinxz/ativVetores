public class Atividade3 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,};
        int numpares = 0;

        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] % 2 == 0){
                numpares++;
            }
        }
        System.out.println("Os números são: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20" );
        System.out.println("A quantidade de números pares é: " + numpares);

    }
}
