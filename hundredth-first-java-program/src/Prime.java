import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isPrime(n));
    }
    static boolean isPrime(int num) {
        if(num<=1) {
            return false;
        }
        if (num != 2) {
            int count = 2;
            while (count * count <= num) {
                if (num % count == 0) {
                    return false;

                }
                count++;
            }

        }
        return true;
    }
}
