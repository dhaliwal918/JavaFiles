package Pattern;
public class pattern2 {
    public static void main(String[] args) {
        for(int i = 1;i<=4;i++){
            if(i==2||i==3){
                for(int k = 1;k<=5;k++){
                    if(k==1||k==5){
                        System.out.print("*");
                        if(k==5){
                            System.out.println();
                        }
                        continue;
                    }
                    System.out.print(" ");
                }
                
                continue;
            }
            for(int j = 1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
