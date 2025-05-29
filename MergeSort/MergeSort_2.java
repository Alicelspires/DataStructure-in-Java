public class MergeSort_2{
    public static void main(String args[]){   	
    	
        int[] array = {8, 2, 5, 3, 4, 7, 6, 1};
        
        mergeSort(array);
        
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+ " ");
        }
    }

	private static void mergeSort(int[] array) {
	    
        if (array.length <= 1) return;
        
        int middle = array.length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[array.length - middle];
		
        // int i = 0; // left array
        // int j = 0; // right array
		 
		for (int i = 0; i < array.length; i++) {
            if (i < middle) {
                leftArray[i] = array[i];
            } else {
                rightArray[i - middle] = array[i];
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
	}
	
	private static void merge(int[] leftArray, int[] rightArray, int[] array) {

		int i = 0, l = 0, r = 0;
		
		 while (l < leftArray.length && r < rightArray.length) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                l++;
            } else {
                array[i] = rightArray[r];
                r++;
            }
            i++;
        }
        
		 while (l < leftArray.length) {
            array[i] = leftArray[l];
            l++;
            i++;
        }
		while (r < rightArray.length) {
            array[i] = rightArray[r];
            r++;
            i++;
        }
	}
}