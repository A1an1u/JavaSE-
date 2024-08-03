import java.util.Scanner;

public class AssignOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int a = input.nextInt();
        if(a>=0){
            System.out.println("The integer is greater than zero");
        }
        else {
            System.out.println("The integer is less than zero");
        }
    }
}
