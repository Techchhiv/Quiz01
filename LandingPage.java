import java.util.Scanner;

public class LandingPage{
    static int choice=1;
    static void display(){
        System.out.print("\n---------- Menu ----------\n"
        + "1. User registering Page\n"
        + "2. User reset password page\n"
        + "3. ReadMe\n"
        + "0. Exit\n"
        + "Please choose your option: ");
    }
    static void pause(){
        Scanner inp = new Scanner(System.in);
        System.out.println("\n(Please press enter to continue))");
        inp.nextLine();
    }
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        while(choice!=0){
            display();
            choice = inp.nextInt();
            System.out.println();
            switch(choice){
                case 1: System.out.println("Hello");pause();break;
                default: System.out.println("\nPlease enter between 0 and 3\n");break;
            }
        }

    }
}