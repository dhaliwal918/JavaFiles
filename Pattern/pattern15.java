package Pattern;
public class pattern15 {
    public static void main(String[] args){
        for(int i = 1 ; i<=5 ; i++){
            System.out.print("*");
            for(int j = 1 ; j<=5 ; j++){
                if(i==j&&i>1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            
            for(int j = 5 ; j>=1 ; j--){
                if(i==j&&i>1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("*");
            System.out.println();
        }
        for(int i = 5 ; i>=1 ; i--){
            System.out.print("*");
            for(int j = 1 ; j<=5 ; j++){
                if(i==j&&i>1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            
            for(int j = 5 ; j>=1 ; j--){
                if(i==j&&i>1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
