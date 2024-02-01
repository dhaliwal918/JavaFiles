import java.util.*;
public class inputArray {
    public static int[] InputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of elements : ");
        int nOE = sc.nextInt();
        int []arr = new int[nOE];
        for(int i = 0 ; i<nOE ; i++ ){
            System.out.print("Enter the number : ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
