public class GreaterFromThreeNumbers {
    public static void main(String args[]) { 
        int one =100;
        int second=340;
        int third=54;
        if(one>second){
            if(one>third){
                System.out.println("One is greater");
            }else{
                System.out.println("Third is greater");
            }
        }
        else{
            if(second>third){
                System.out.println("Second is Greater");
            }else{
                System.out.println("Third is Greater");
            }
        }
	}
}
