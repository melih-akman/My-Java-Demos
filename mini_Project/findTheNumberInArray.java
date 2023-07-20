package mini_Project;

public class findTheNumberInArray {
    public static void main(String[] args) {
        int[] numbers = new int[] { 1, 5, 8, 7, 9 };
        int searchNum = 7;
        boolean check=false;
        for (int number : numbers) {
            if (number == searchNum) {
                check=true;
                break;
            }
        }
        if (check) {
            System.out.println("Yes find it " + searchNum + "in array");
        }
    }
}
