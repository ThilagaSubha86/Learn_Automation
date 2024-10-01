package Sep.Task_20092024;

import java.sql.SQLOutput;

public class Maximum_Between_3_Numbers {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        int max = a;
        if(a>=b && a>=c) {
            max= a;
        } else if(b>=a && b>=c) {
            max=b;
        } else if (c>=a && c>=b) {
            max=c;
        }
        System.out.println(max);




    }
}
