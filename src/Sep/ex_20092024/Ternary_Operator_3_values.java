package Sep.ex_20092024;

public class Ternary_Operator_3_values {
    public static void main(String[] args) {
        int score = 85;

        String Grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : "F";
        System.out.println("Grade: " + Grade);
    }
}

