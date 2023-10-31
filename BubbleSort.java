package metodosSimples.bubbleSort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] vetor = {8, 6, 4 ,18, 15, 10};
        int aux;

        for(int i = 0; i < vetor.length; i ++){
            for(int j = 0; j < (vetor.length - 1); j ++){
                if(vetor[j] > vetor[j + 1]){
                    aux = vetor[j + 1];
                    vetor[j + 1] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }

        for(int i = 0; i < vetor.length; i ++){
            System.out.print(" | " + vetor[i] + " | ");
        }
    }
}