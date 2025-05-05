public class quickSort{
    public static void main(String[] args){
        int[] nums = {9, 7, 5, 11, 12, 2, 14, 3, 10, 6};
        quickSort(nums, 0, nums.length-1);
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
    public static void quickSort(int vet[], int ini, int fim){
        int divisao;
        if(ini < fim){
            divisao = separa(vet, ini, fim);
            quickSort(vet, ini, divisao-1);
            quickSort(vet, divisao+1, fim);
        }
    }
    public static int separa(int vet[], int ini, int fim){
        int pivo = vet[ini], i = ini+1, f = fim, aux;
        while(i <= f){
            while(i <= fim && vet[i] <= pivo){
                i++;
            }
            while(pivo < vet[f]){
                f--;
            }
            if(i < f){
                aux = vet[i];
                vet[i] = vet[f];
                vet[f] = aux;
                ++i; --f;
            }
        }
        vet[ini] = vet[f];
        vet[f] = pivo;
        return f;
    }
}