package methodOverloading;

public class Main {
    public static void main(String[] args) {
        fourTransaction fourTransaction = new fourTransaction();
        System.out.println(fourTransaction.add(2, 3));
        System.out.println(fourTransaction.add(2, 3, 4));
    }
}
