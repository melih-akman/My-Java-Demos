package mini_Project;
public class letterThickOrThin {
    public static void main(String[] args) {
        char letter = 'a';
        switch (letter) {
            case 'a':
            case 'o':
            case 'u':
                System.out.println("This letter is thick");
                break;
            default:
                System.out.println("This letter is thin");
                break;
        }
    }
}
