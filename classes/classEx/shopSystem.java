package classes.classEx;

public class shopSystem {
    public static void main (String[] args) {
        customerManager customer = new customerManager(); //101 reference  //stack heap 
        customerManager customer2 = new customerManager();//102 reference
        customer=customer2;// 101 reference = 102 reference //! The garbage collector deletes it because  heap 101 reference = null because it is not used.
        customer.add("Melih");
        customer.remove();
        customer.update();
        int [] numbers = new int[] {1,2,3};
        int [] numbers2 = new int[] {4,5,6};
        numbers2=numbers;
        System.out.println(numbers[0]);
        numbers[0]=10;//
        System.out.println(numbers2[0]);

    }
}
