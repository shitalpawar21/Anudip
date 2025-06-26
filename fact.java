import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        float fact1 = 1;
        for (int i = 1; i <= num; i++) {
            fact1 *= i;
        }
        System.out.println("factorial is" + fact1);
    }
}
