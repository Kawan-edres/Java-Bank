
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter yoour Name: ");

        String name=sc.nextLine();
        System.out.print("Enter yoour Id: ");
        String customerId=sc.nextLine();


        JavaBank obj1=new JavaBank(name,customerId);
        obj1.menu();


    }
}

