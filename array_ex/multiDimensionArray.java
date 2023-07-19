package array_ex;

public class multiDimensionArray {
    public static void main(String[] args) {
        String[][] city = new String[3][3];
        city[0][0] = "New York";
        city[0][1] = "Los Angeles";
        city[0][2] = "Chicago";
        city[1][0] = "Tokyo";
        city[1][1] = "Kyoto";
        city[1][2] = "Osaka";
        city[2][0] = "London";
        city[2][1] = "Manchester";
        city[2][2] = "Liverpool";
        for (int i = 0; i < city.length; i++) {
            for (int j = 0; j < city[i].length; j++) {
                System.out.println(city[i][j]);
            }
        }
    }
}
