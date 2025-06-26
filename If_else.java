import java.util.Scanner;
public class If_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();

        if(number > 0) {
            System.out.println("The number is positve ");
        } 
        else  if(number <0) {
            System.out.println("The number is negative ");
        }
        else {
            System.out.println("The number is zero");
        }
    
    }
    
}
