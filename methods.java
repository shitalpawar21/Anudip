import java.util.Scanner;

public class methods {
    int mul(){
        int a =10;
        int b= 30;
        int mull = a*b ;
        
        return mull;
    }

    methods(){
        System.out.println("this is constructor");

    }
    public static void main(String[] args) {
        methods m1 = new methods();
        int mull= m1.mul();
        System.out.println(mull);
    }
}
