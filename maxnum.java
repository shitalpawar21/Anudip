import java.util.Scanner;

public class maxnum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n1 = sc.nextInt();
        System.out.println("Enter a second number");
        int n2 = sc.nextInt();
        System.out.println("Enter a third number");
        int n3 = sc.nextInt();

        int max = n1;
        if (n2 > max) {
            max = n2;
        }
        if (n3 > max) {
            max = n3;
        }
        System.out.println("maximum number is:" + max);
    }
}