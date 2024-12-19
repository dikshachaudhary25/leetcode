import java.util.*;
public class subset{
    public static void sets(int[] arr, int i, ArrayList<Integer> list){
        if(i==arr.length){
            System.out.println(list);
            return;
        }
        list.add(arr[i]);
        sets(arr, i+1, list);
        list.remove(list.size()-1);
        sets(arr, i+1, list);
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