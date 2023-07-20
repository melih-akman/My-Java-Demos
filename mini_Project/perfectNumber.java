package mini_Project;
//6=(1+2+3) a number whose divisors are equal to itself
public class perfectNumber {
    public static void main(String[] args) {
        int perfectNumbers = 28, check = 0;
        for (int i = 1; i < perfectNumbers; i++) {
            if (perfectNumbers % i == 0) {
                check += i;
            }
        }
        if (perfectNumbers == check) {
            System.out.println("Yes it's " + perfectNumbers + " perfect number");
        } else {
            System.out.println("NO it isn't " + perfectNumbers + " perfect number");
        }
    }
}
