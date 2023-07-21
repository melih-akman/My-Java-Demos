package methods;

public class method {
    public static void main(String[] args) {
        int[] numbers = new int[] { 1, 5, 8, 7, 9 };
        int searchNum = 7;
        boolean check = false;
        for (int number : numbers) {
            if (number == searchNum) {
                check = true;
                break;
            }
        }
        ifPrint(check, searchNum);
    }

    public static void ifPrint(boolean check, int searchNum) {
        if (check) {
            System.out.println("Yes find it " + searchNum + " in array");
            
        }
    }
}
