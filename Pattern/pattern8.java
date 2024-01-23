package Pattern;
public class pattern8 {
    public static void main(String[] args){
        int ans = 0 ;
        for(int i = 1 ; i<=5 ; i++){
            for(int j = 1 ; j<=i ; j++){
                ans++ ;
                System.out.print(ans + " ");
            }
            System.out.println();
        }
    }
}
