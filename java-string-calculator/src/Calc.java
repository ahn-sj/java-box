import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Calc {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().replace(" ", "");

        Queue<Character> operators = divideOperator(input);
        String[] operands = divideOperand(input);

        int rst = Integer.parseInt(operands[0]);

        for (int i = 1; i < operands.length; i++) {
            Character operator = operators.poll();
            int operand = Integer.parseInt(operands[i]);

            rst = calculator(rst, operator, operand);
        }
        System.out.println(rst);
    }

    private static Queue<Character> divideOperator(String input) {
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if(isValidRange(input, i, c)) {
                queue.offer(input.charAt(i));
            }
        }
        return queue;
    }

    private static String[] divideOperand(String input) {
        return input.split("\\+|-|\\*|/");
    }

    private static int calculator(int rst, Character operator, int operand) {
        if(operator == '+') rst += operand;
        if(operator == '-') rst -= operand;
        if(operator == '*') rst *= operand;
        if(operator == '/') {
            isDivideZero(operand);
            rst /= operand;
        }
        return rst;
    }

    private static boolean isValidRange(String input, int i, char c) {
        return !(c - '0' >= 0 && input.charAt(i) - '0' < 10);
    }

    private static void isDivideZero(int operand) {
        if(operand == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
    }
}