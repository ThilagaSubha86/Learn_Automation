package Sep.Task_20092024;

import javax.xml.transform.Result;

public class Ternary_Operator_Score {
    public static void main(String[] args) {


        int score = 85;

        String grade;
        if ((score >= 90))
            grade = "A";
        else if ((score >= 80))
            grade = "B";
        else if (score >= 70) grade = "C";
        else grade="F";



        System.out.println("Grade"+grade);
    }


}
