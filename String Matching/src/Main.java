import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pat1="";
        String pat2="";
        String pat3="";
        System.out.printf("Enter 3 String : ");
        pat1 = input.next();
        pat2 = input.next();
        pat3 = input.next();

        if (pat1.equals(pat2) && pat1.equals(pat3)){
            System.out.printf("The result is same");
        }
        else System.out.printf("You Failed");
    }
}
