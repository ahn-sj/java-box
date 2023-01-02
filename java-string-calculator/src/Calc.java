public class Calc {
    public static void main(String[] args) {
        String[] operators = {"+", "-", "*", "/"};
        String given = "3+4";

        for (int i = 0; i < given.length(); i++) {
            for (int j = 0; j < operators.length; j++) {
                boolean isContain = String.valueOf(given.charAt(i)).contains(operators[j]);

                if(isContain) {
//                    operands[0] = given.ch
                }
            }
        }
    }
}