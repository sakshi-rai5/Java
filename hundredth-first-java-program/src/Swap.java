import java.sql.SQLOutput;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        swap(a,b);
    }
    static void swap(int a, int b) {
        int temp = 0;
        temp = b;
        b = a;
        a = temp;
        System.out.println(a + " " + b);
    }
}
