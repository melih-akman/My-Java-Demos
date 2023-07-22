package inheritanceEx;

public class credit {
    public static void main(String[] args) {
        creditUI creditUIData = new creditUI();
        creditUIData.creditCalculate(new teacherCreditManager());
    }
}
