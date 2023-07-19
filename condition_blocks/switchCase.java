package condition_blocks;

public class switchCase {
    public static void main(String[] args) {
        char studentNote = 'A';
        switch (studentNote) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Very Good");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Pass");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid Note");
                break;
        }
    }
}
