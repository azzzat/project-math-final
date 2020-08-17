package WorkWithConsole;

import EquationSolving.EquationSolving;
import Exceptions.NullDenominatorException;
import Exceptions.WrongSymbolException;

import java.util.ArrayList;
import java.util.Scanner;

public class WorkWithConsole {

    public static ArrayList<String> getExpression() throws WrongSymbolException {

        Scanner scan = new Scanner(System.in);
        String inputExpression = scan.nextLine();

        String[] text = inputExpression.split(" ");

        ArrayList<String> expression = new ArrayList<>();

        for (String symbol : text) {
            switch (symbol) {
                case "*":
                case "/":
                case "-":
                case "+":
                    expression.add(symbol);
                    break;
                case "0":
                    expression.add(symbol + ".00");
                    break;
                default:
                    try {
                        double number = Double.parseDouble(symbol);
                        expression.add(String.format("%.2f", number));
                    } catch (NumberFormatException e) {
                        throw new WrongSymbolException("Недопустимый знак: " + symbol);
                    } catch (NullPointerException e) {
                        expression.add(symbol + ".00");
                    }
            }
        }

        return expression;
    }

}
