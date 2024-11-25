import java.util.Scanner;

public class first_screen {
    public static int options(){
        System.out.println("\nOur menu ..........\n");
        System.out.println("[1] log in .");
        System.out.println("[2] Create account .");
        System.out.println("[3] Exist . ");
        System.out.println("_____________________\n");
        System.out.println("Enter number from above : ");
        Scanner input=new Scanner(System.in);
        return input.nextInt();
    }

    public static void frist(){
        int number;
        do{
            number=options();
            switch(number){
                case 1:
                    System.out.println("log in");
                    break;
                case 2:
                    System.out.println("create ");
                    break;
                case 3:
                    break;
            }
        }while(number!=3);
    }
}
