package Sep.ex_23092024;

public class Lab_082 {
    public static void main(String[] args) {
        int course = 006;
        switch (course) {
            case 001,002,003:
                System.out.println("This is MEchanical Group");
                break;
            case 004,005,006:
                System.out.println("This is electrical Group");
                break;
            default:
                System.out.println("This is Management group");
        }
    }
}
