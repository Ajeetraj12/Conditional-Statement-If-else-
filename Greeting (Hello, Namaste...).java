import java.util.*;
class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        
        switch(button) {
            case 1 : System.out.println("Namaste");
            break;
            case 2 : System.out.println("Hello");
            break;
            case 3 : System.out.println("Ram Ram");
            break;
            case 4 : System.out.println("Hey");
            break;
            default : System.out.println("Invalid Button");
        }
    }
}