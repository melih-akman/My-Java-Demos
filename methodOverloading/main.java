package methodOverloading;

public class main {
    public static void main(String[] args) {
        fourTransaction fourTransaction = new fourTransaction();
        System.out.println(fourTransaction.add(2, 3));
        System.out.println(fourTransaction.add(2, 3, 4));
    }
}
