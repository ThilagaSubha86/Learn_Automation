package Sep.ex_20092024;

public class Ternary_Operator_Maximum_Between_3_Numbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 45;

        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("Max: " + max);
    }
}
