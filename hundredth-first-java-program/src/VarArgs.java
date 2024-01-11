import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,45,11,3,567);
        multiple(2,3,"perk","freund","robot");
    }
    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int x, int y, String ...var) {
        System.out.println(Arrays.toString(var));
    }
}
