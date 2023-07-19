package array_ex;

public class arrayS{
    public static void main(String[] args) {
        String[] student = new String[5];
        student[0] = "John";
        student[1] = "Mary";
        student[2] = "Bob";
        student[3] = "Anne";
        student[4] = "Peter";
        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i]);
        }
        for (String i : student) {
            System.out.println(i);
        }
        
    }

}