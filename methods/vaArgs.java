package methods;

import java.util.Scanner;

public class vaArgs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(minus(5,8,1,7,4,2,1,2,6));
        scan.close();
    }

    public static int minus(int... numbers) {
        int minusS = 0;
        for (int number : numbers) {
            minusS += number;
        }
        return minusS;
    }
}
