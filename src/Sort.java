public class Sort {
    
    static void bucketSort(int tamanho, int[] l){
        // Ω(n + k) - O(n * n)
    }

    static void gnomeSort(int tamanho, int[] l){
        // Ω(n) - O(n * n)
        int i = 0;
        int interacao = 0;
        while (i < tamanho) {
            if (i == 0 || l[i-1] <= l[i]) i++;
		    else {
                int tmp = l[i];
                l[i] = l[i-1];
                l[--i] = tmp;
            }
            interacao++;
        }
        System.out.println("GnomeSort - Quantidade de iterações: " + interacao);
    }


    static void bubbleSort(int tamanho, int[] l){
        // Ω(n) - O(n ** n)
        boolean troca;
        int interacao = 0;

        for (int i = 0; i < tamanho - 1; i++) {
            interacao++;
            troca = false;

            for (int j = 0; j < tamanho - 1 - i; j++) {
                interacao ++;
                if (l[j] > l[j + 1]) {
                    int temp = l[j];
                    l[j] = l[j + 1];
                    l[j + 1] = temp;
                    troca = true;
                }
            }

            if (!troca) break;
        }
        System.out.println("bubbleSort - Quantidade de iterações: " + interacao);
    }

    static void combSort(int tamanho, int[] l){
        // Ω(n log n) - O(n)
        boolean sorted = false;
        int gap = tamanho, interacao = 0, i, sm, aux;

        while (!sorted) {
            interacao++;
            gap = (int) (gap/1.3);

            if (gap <= 1) {
                gap = 1;
                sorted = true;
            }

            for (i = 0; i < tamanho - gap; i ++) {
                interacao++;
                sm = gap + i;
                if (l[i] > l[sm]) {
                    aux = l [sm];
                    l[sm] = l[i];
                    l[i] = aux;
                    sorted = false;
                }
            }
        }
        System.out.println("CombSort - Quantidade de iterações: " + interacao);
    }

    static void selecaoSort(int tamanho, int[] l){
        // Ω(n * n) - O(n * n)
        int interacao = 0;
        for (int i = 0; i < tamanho - 1; i++) {
            interacao++;
            int minIndex = i; 

            for (int j = i + 1; j < tamanho; j++) {
                interacao++;
                if (l[j] < l[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = l[i];
            l[i] = l[minIndex];
            l[minIndex] = temp;
        }
        System.out.println("selecaoSort - Quantidade de iterações: " + interacao);
    }

    static void cocktailSort(int tamanho, int[] l){
        // Ω(n) - O(n * n)
        boolean troca = true;
        int start = 0, interacao = 0;
        int end = tamanho - 1;

        while (troca) {
            troca = false;

            for (int i = start; i < end; i++) {
                interacao++;
                if (l[i] > l[i + 1]) {
                    int temp = l[i];
                    l[i] = l[i + 1];
                    l[i + 1] = temp;
                    troca = true;
                }
            }

            if (!troca) break;

            end--;

            troca = false;

            for (int i = end - 1; i >= start; i--) {
                interacao++;
                if (l[i] > l[i + 1]) {
                    int temp = l[i];
                    l[i] = l[i + 1];
                    l[i + 1] = temp;
                    troca = true;
                }
            }

            start++;
        }
        System.out.println("CocktailSort - Quantidade de iterações: " + interacao);
    }
}
