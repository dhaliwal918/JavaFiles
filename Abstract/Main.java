package Abstract;

public class Main {
    public static void main(String[] args){
        String name = "Sukhmeet Singh Dhaliwal";
        String names = new String("Sukhmeet Singh Dhaliwal");
        System.out.println(name==names);
        StringBuffer naming = new StringBuffer("Sukhmeet Singh Dhaliwal");
        System.out.println(naming);
        System.out.println(name);
        System.out.println(names);
        StringBuilder namename = new StringBuilder("Dhaliwal");
        System.out.println(namename);
        namename.append("Sukhmeet Singh Dhaliwal");
        System.out.println(namename);
    }
}
