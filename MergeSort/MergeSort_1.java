public class MergeSort_1{
    public static void main(String[] args){
        int[] nums = {5, 2, 9, 1, 5, 6};
        mergeSort(nums, 0, nums.length-1);
        for (int num : nums){
            System.out.print(num + " ");
        }
    }
    public static void mergeSort(int v[], int ini, int fim){
        if (ini < fim){
            int meio = (ini+fim)/2;
            mergeSort (v,ini, meio);
            mergeSort (v,meio+1, fim);
            mescla(v, ini, meio, meio+1,fim);
        }
    }
    public static void mescla(int v[], int iE, int fE, int iD, int fD){
        int aux[]=new int[fD-iE+1], ini=iE, i=0;

        while (iE<=fE && iD<=fD){
            if (v[iE] < v[iD]){
                aux[i]=v[iE];
                iE++;
            } else {
                aux[i]=v[iD];
                iD++;
            }
            i++;
        }
        while (iE<=fE){
            aux[i]=v[iE];
            iE++;
            i++;
        }

        while (iD<=fD){
            aux[i]=v[iD];
            iD++;
            i++;
        }
        i=0;
        for (int ind=ini; ind<=fD;i++,ind++){
            v[ind]=aux[i];
        }
    }
}