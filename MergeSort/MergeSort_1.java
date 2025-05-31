public class MergeSort_1{
    public static void main(String[] args) {
        int v[] = {80, 65, 71, 190, 180};
        mergeSort(v, 0, v.length-1);
        for(int num : v){
            System.out.print(num + " ");
        }
    }
    public static void mergeSort(int v[], int start, int end){
        if(start < end){
            int middle = (start + end)/2;
            mergeSort(v, start, middle);            // Divide lado esquerdo do array - Split left side array
            mergeSort(v, middle+1, end);            // Divide lado direito do array  - Split right side array
            merge(v, start, middle, middle+1, end); // Começa a mesclar as partes já ordenadas -  Starts to merge the sorted sides
        }
    }
    public static void merge(int v[], int start, int startEnd, int endStart, int end){
        // Inicia um array, ajudando a ordenar os lados enquanto os mescla: 
        // Starts an array that helps sort the sides while merge them: 

        int aux[] = new int[end-start+1]; 
        int i = 0;
        int s = start;
        
        while(start <= startEnd && endStart <= end){ 
            /* 
                Verifica se o array da direita e da esquerda tem ainda
                valores suficientes para serem comparados um com o outro
                
                Checks whether the right and left arrays still have enough values 
                to compared to each other
            */
            
            if(v[start] < v[endStart]){
                aux[i] = v[start];
                start++;
            } else {
                aux[i] = v[endStart];
                endStart++;
            }
            i++;
        }

        //Mesclando o que restou to array - Merging what left in the array
        while(start <= startEnd){
            aux[i] = v[start];
            start++;
            i++;
        }
        while(endStart <= end){
            aux[i] = v[endStart];
            endStart++;
            i++;
        }

        // Put all of the values together into the original array 
        for(int j = 0; j <= aux.length-1; j++, s++){
            v[s] = aux[j];
        }
    }
}