import java.util.*;
public class containsduplicate{
    public static void checkarr(int[] a){
        int[] b = new int[a.length];
        for(int i =0;i<a.length;i++){
            b[i]=a[i];
        }
        for(int i = 0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(b[i]==a[j]){
                    System.out.println("Duplicate values present");
                    return;
                }
            }
        }
        System.out.println("Duplicate values not present");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        for(int i = 0; i<a.length;i++){
            a[i]= sc.nextInt();
        }
        checkarr(a);
    }
}