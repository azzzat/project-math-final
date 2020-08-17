package EquationSolving;

import CheckExpressionCorrectness.CheckExpressionCorrectness;
import Exceptions.NullDenominatorException;
import Exceptions.WrongSymbolException;

import java.util.ArrayList;

public class EquationSolving {

    public static double solveAnEquation (ArrayList<String> expression) throws NullDenominatorException, WrongSymbolException {

        CheckExpressionCorrectness.check(expression);

        for (int i = 0; i < expression.size(); i++) {
            String newSring = expression.get(i).replace(',','.');
            expression.set(i, newSring);
        }

        if (expression.contains("*")) {
            int index = expression.indexOf("*");
            double solution1 = Double.parseDouble(expression.get(index - 1))
                    * Double.parseDouble(expression.get(index + 1));
            expression.remove(index - 1);
            expression.remove(index - 1);
            expression.set(index - 1, String.format("%f", solution1));

        } else if (expression.contains("/")) {
            int index = expression.indexOf("/");
            double solution1 = Double.parseDouble(expression.get(index - 1))
                    / Double.parseDouble(expression.get(index + 1));
            expression.remove(index - 1);
            expression.remove(index - 1);
            expression.set(index - 1, String.format("%f", solution1));

        } else if (expression.contains("+")) {
            int index = expression.indexOf("+");

            double solution1 = Double.parseDouble(expression.get(index - 1))
                    + Double.parseDouble(expression.get(index + 1));
            expression.remove(index - 1);
            expression.remove(index - 1);
            expression.set(index - 1, String.format("%f", solution1));

        } else if (expression.contains("-")) {
            int index = expression.indexOf("-");
            double solution1 = Double.parseDouble(expression.get(index - 1))
                    - Double.parseDouble(expression.get(index + 1));
            expression.remove(index - 1);
            expression.remove(index - 1);
            expression.set(index - 1, String.format("%f", solution1));

        } else if (expression.size() == 1) {
            return Double.parseDouble(expression.get(0));
        }

        return EquationSolving.solveAnEquation(expression);
    }
}
