import java.util.Scanner;

public class Occurence_of_Digit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int n = in.nextInt();
        int count = 0;
        while(number > 0) {
            if(number%10 == n) {
                count++;
            }
            number = number/10;
        }
        System.out.println(count);
    }
}
