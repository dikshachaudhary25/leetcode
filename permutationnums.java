import java.util.*;
public class permutationnums{
    public static void sets(int[] arr, int i, ArrayList<Integer> list){
        if(i==arr.length){
            System.out.println(list);
            return;
        }
        for(int j = i; j<arr.length; j++){
            swap(arr,i,j);
            list.add(arr[i]);
            
            sets(arr, i+1, list);
            swap(arr, i, j);
            list.remove(list.size()-1);
            
        }
        
    }
    public static void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the natural number till where you want subsets : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i= 0; i<n;i++){
            arr[i] = i+1;
        }
        ArrayList<Integer> list = new ArrayList<>(); 
        sets(arr, 0, list);
    }
}