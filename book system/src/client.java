import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class client {
    protected String name;
    protected String position;
    protected String account ;
    static client c=new client();
    public static void log_in(){
        System.out.println("\nLog in Screen ....");
        System.out.println("\nEnter your name : ");
        Scanner input=new Scanner(System.in);
        c.name=input.next();
        System.out.println("Enter your job  : ");
        c.position=input.next();
    }
    public static void show_date (){
        System.out.println("User name : "+c.name);
        System.out.println("Current_date : 15/8/2024 ");
    }
   public static void create (ArrayList<client>my_cleint) throws IOException {
        client c=new client();
        Scanner input=new Scanner (System.in);
       System.out.println("\nEnter your name : ");
       c.name=input.next();
       System.out.println("What is your job : ");
       c.position=input.next();
       FileWriter write=new FileWriter("clients.txt",true);
       BufferedWriter my_file=new BufferedWriter(write);

   }
}
