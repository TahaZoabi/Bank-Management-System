public class Main {
    public static void main(String[] args) {

        String test = roundTwoDecimal(14.5047);
        System.out.println(test + " heheh");

        // String.format("%.2f", amount)
    }

    public static String roundTwoDecimal(double money) {
        return String.format("$%.2f", money);
    }

}