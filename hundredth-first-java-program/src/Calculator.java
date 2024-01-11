import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while(true) {
            System.out.println("Enter the operator: ");
            char op = in.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter the numbers: ");
                int a = in.nextInt();
                int b = in.nextInt();

                if(op == '+') {
                    ans = a + b;
                }
                if(op == '-') {
                    ans = a - b;
                }
                if(op == '*') {
                    ans = a * b;
                }
                if(op == '/') {
                    if(b != 0) {
                        ans = a / b;
                    }

                }
                if(op == '%') {
                    ans = a % b;
                }
            }
            else if(op == 'X' || op == 'x') {
                break;
            }
            else {
                System.out.println("Invalid Operator");
            }
            System.out.println(ans);
        }

    }
}
