/**
 *
 * @author Jigar Borad
 *
 */


import java.util.Random;

public class Problem {

    public static String generateEq() {
        Random random = new Random();
        String expression = "";
        int a = (int) random.nextInt(10);
        int b = (int) random.nextInt(10);

        final int type = random.nextInt(2);
        switch (type) {
            case 0:
                expression = a + "+" + b;
                break;
            case 1:
                expression = a + "-" + b;
                break;
            case 2:
                expression = a + "*" + b;
                break;
        }
        return expression;
    }

    public static int calculateEq(String expression) {
        int result = 0;
        int a = Character.getNumericValue(expression.charAt(0));
        int b = Character.getNumericValue(expression.charAt(2));
        char c = expression.charAt(1);
        switch (c) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '/':
                result = a / b;
                break;
            case '*':
                result = a * b;
                break;
        }

        return result;
    }

    public static void main(String[] args) {
        Problem p = new Problem();
        String ex = p.generateEq();
        System.out.println("Expression : " + ex + " = " + p.calculateEq(ex));

    }

}
