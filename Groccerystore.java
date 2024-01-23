import java.util.*;
public class Groccerystore {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float totalprice = 0;
        int items = 0;
        float price;
        String itemname;
        System.out.println("This is Groccery store\nWe have 10 items\nIf you want to know then enter \"Menu\"");
        do {
            System.out.print("Enter name of item : ");
            itemname = sc.nextLine();
            System.out.println(itemname);
        
            price = groccery(itemname);
            if (itemname.equals("Stop")) {
                break;
            }else if (itemname.equals("Menu")) {
                System.out.println("Sugar - 44");
                System.out.println("Salt - Tata salt - 30 / Surya salt - 200");
                System.out.println("Tea leaves - Taj mahal - 130 / Tata tea premium - 35");
                System.out.println("egg - 7");
                System.out.println("Mustard oil - 120");
                System.out.println("Notebook - Normal - 20 / Large - 50 / Extralarge - 100");
                System.out.println("Rice - 235");
                System.out.println("Cereals - Split peas - 66 / Navy bean - 125 / Chickpeas - 250 / Black beans - 150 / Kidney beans - 200");
                System.out.println("Wheat flour - 50");
                continue;
            } else if (price == 0) {
                System.out.println("This item is not available");
            }  else {
                totalprice = totalprice + price;
                items++;
            }
        } while (price >= 0);
        
                       
        System.out.println("The number of item in your cart is : "+items);
        System.out.println("The total price : "+ totalprice);
    }
    public static float groccery(String name){
        Scanner sc = new Scanner(System.in);
        float q;//shortform of quatity
        switch (name) {
            case "Sugar":
                q = qinkg();
                System.out.println("Adding Sugar");
                System.out.println("Successfully added to cart");
                return q*44;
            case "Wheat flour" : 
                q = qinkg();
                System.out.println("Adding Wheat");
                System.out.println("Successfully added to cart");
                return  q*50;
            case "Salt" :
                System.out.print("Enter Which type of salt you Want(Tata Salt or Surya Salt) : ");
                String salt = sc.nextLine();
                if(salt=="Tata salt"){
                    q = qin();
                    System.out.println("Adding Tata Salt");
                    System.out.println("Successfully added to cart");
                    return q*30;
                }else if(salt=="Surya salt"){
                    q = qin();
                    System.out.println("Adding Surya salt");
                    System.out.println("Successfully added to cart");
                    return q*200;
                }
                break;
                case "Tea leaves" :
                System.out.print("Enter Which tea leaves you want (Taj mahal or Tata Tea Premium) : ");
                String tealeave = sc.nextLine();
                if (tealeave.equals("Taj mahal")) {
                    q = qin();
                    System.out.println("Adding Taj mahal tea leaves");
                    System.out.println("Successfully added to cart");
                    return q * 170;
                } else if (tealeave.equals("Tata tea premium")) {
                    q = qin();
                    System.out.println("Adding tata tea premium ");
                    System.out.println("Successfully added to cart");
                    return q * 35;
                } else {
                    System.out.println("Invalid input. Please enter either 'Taj mahal' or 'Tata Tea Premium'.");
                    return 0;
                }            
            case "Egg" :
                q = qin();
                System.out.println("Adding egg");
                System.out.println("Successfully added to cart");
                return q*7;
            case "NoteBook" : 
                System.out.print("Enter size of Notebook (Normal,Large,Extralarge)");
                String size = sc.nextLine();
                if(size=="Normal"){
                    System.out.println("Adding Notebook");
                    System.out.println("Successfully added to cart");
                    q = qin();
                    return q*20;
                }else if(size=="Large"){
                    System.out.println("Adding Notebook");
                    System.out.println("Successfully added to cart");
                    q = qin();
                    return q*50;
                }else if(size=="Extralarge"){
                    System.out.println("Adding Notebook");
                    System.out.println("Successfully added to cart");
                    q = qin();
                    return q*100;
                }
                break;
            case "Mustard oil" :
                q = qin();
                System.out.println("Adding Mustard oil");
                System.out.println("Successfully added to cart");
                return q*120;
            case "Rice" :
                q = qinkg();
                System.out.println("Adding Rice");
                System.out.println("Successfully added to cart");
                return q*35;
            case "Cereals":
                System.out.print("Enter which cereal you want (Split peas, Navy bean, Chickpeas, Black Beans, Kidney beans): ");
                String cereal = sc.nextLine();
                if (cereal.equalsIgnoreCase("Split peas")) {
                    q = qinkg();
                    System.out.println("Adding Cereal");
                    System.out.println("Successfully added to cart");
                    return q * 60;
                } else if (cereal.equalsIgnoreCase("Navy bean")) {
                    q = qinkg();
                    System.out.println("Adding Cereal");
                    System.out.println("Successfully added to cart");
                    return q * 125;
                } else if (cereal.equalsIgnoreCase("Chickpeas")) {
                    q = qinkg();
                    System.out.println("Adding Cereal");
                    System.out.println("Successfully added to cart");
                    return q * 250;
                } else if (cereal.equalsIgnoreCase("Black beans")) {
                    q = qinkg();
                    System.out.println("Adding Cereal");
                    System.out.println("Successfully added to cart");
                    return q * 150;
                } else if (cereal.equalsIgnoreCase("Kidney beans")) {
                    q = qinkg();
                    System.out.println("Adding Cereal");
                    System.out.println("Successfully added to cart");
                    return q * 200;
                }
                break;
            default:
                break;
        }
        return 0;
    }
    public static float qinkg(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the quantity in Kgs : ");
        float quan = sc.nextInt();
        return quan;
    }
    public static int qin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the quantity : ");
        int quan = sc.nextInt();
        return quan;
    }
    
}
 