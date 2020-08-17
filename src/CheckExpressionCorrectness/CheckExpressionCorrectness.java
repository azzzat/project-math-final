package CheckExpressionCorrectness;

import Exceptions.NullDenominatorException;
import Exceptions.WrongSymbolException;

import java.util.ArrayList;

public class CheckExpressionCorrectness {
    ArrayList<String> expression;

    public CheckExpressionCorrectness(ArrayList<String> expression) {
        this.expression = expression;
    }

    public static boolean check(ArrayList<String> expression) throws WrongSymbolException, NullDenominatorException {

        if (expression.get(0).equals("*")
                || expression.get(0).equals("/")
                || expression.get(0).equals("+")
                || expression.get(0).equals("-")) {
            throw new WrongSymbolException("Первый символ не может иметь знак " + expression.get(0));
        }

        if (expression.get(expression.size() - 1).equals("*")
                || expression.get(0).equals("/")
                || expression.get(0).equals("+")
                || expression.get(0).equals("-")) {
            throw new WrongSymbolException("Последний символ не может иметь знак " + expression.get(0));
        }

        for (int num = 1; num < expression.size(); num++) {
            String a = expression.get(num - 1);
            String b = expression.get(num);
            if ((a.equals("*") || a.equals("/")  || a.equals("+") || a.equals("-")) &&
                    (b.equals("*") || b.equals("/")  || b.equals("+") || b.equals("-"))) {
                throw new WrongSymbolException("Символы расположены друг за другом: " + a + " " + b);
            }

            if ((a.equals("/")) &&
                    (b.startsWith("0.") )) {
                throw new NullDenominatorException("Нельзя делить на 0");
            }

        }

        return false;
    }


}
