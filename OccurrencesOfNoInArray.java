import java.util.*;

public class OccurrencesOfNoInArray {
    public static void main(String[] args) {
        int[] arr = {4,2,5,2,6,43,6,3,57,43,3,6,3,2,6,87,5,3,2,5,7,5,4,3,76,8,4,7,4,7,9,0,7,5,7,4,5,3,2,6,2,5,7,3,6,3,2,};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check Occurrences of number in arr : ");
        int num = sc.nextInt();
        int ans = OccInArr(num , arr);
        System.out.println("The occurrences of " + num + " in array is : " + ans);
    }
    public static int OccInArr(int num,int[]arr){
        int count = 0;
        for(int i = 0 ; i<arr.length ; i++ ){
            if(num==arr[i]){
                count++;
            }
        }
        return count;
    }
}
