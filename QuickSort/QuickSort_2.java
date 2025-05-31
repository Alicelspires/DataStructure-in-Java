public class QuickSort_2{
    public static void main(String[] args) {
        int v[] = {80, 65, 71, 190, 180};
        quickSort(v, 0, v.length-1);
        for(int num : v){
            System.out.print(num + " ");
        }
    }
    public static void quickSort(int v[], int start, int end){
        if(start < end){
            /*
                1.  Reorganiza os elementos com base em um pivô (valor final).
                2.  Chama quickSort recursivamente para ordenar os elementos à esquerda do pivô.
                3.  Chama quickSort recursivamente para ordenar os elementos à direita do pivô.
                
                1.  Reordganize the values based on a pivot (final value).
                2.  Recursively call quickSort to sort the elements on the left side of the pivot.
                3.  Recursively call quickSort to sort the elements on the right side of the pivot.
            */
            
            int pivot = divide(v, start, end);
            quickSort(v, start, pivot-1);
            quickSort(v, pivot+1, end);
        }
    }
    public static int divide(int v[], int start, int end){
        int pivot = v[end]; // pivo - pivot
        int i = start-1;    // index começa fora de limite do array - index starts out of bounds of the array
        
        for(int j = start; j <  end; j++) {
			if(v[j] < pivot) { // Organiza valores que estaram ao lado esquerdo do pivo - Organize values on the left side of the pivot
				i++;
				int temp = v[i];  
				v[i] = v[j];
				v[j] = temp;
			}
		}
		// Colocar o pivo entre os menores e maiores valores, ou seja, na sua posição correta.
		// Put the pivot between the smallest and greatest values, thar is in its correct position.
		i++;
		int temp = v[i];
		v[i] = v[end];
		v[end] = temp;
		
		return i;
    }
}