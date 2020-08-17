package com.company;

import EquationSolving.EquationSolving;
import Exceptions.NullDenominatorException;
import Exceptions.WrongSymbolException;
import ShowResult.ShowResult;
import WorkWithConsole.WorkWithConsole;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws WrongSymbolException, NullDenominatorException {

            ArrayList<String> expression = WorkWithConsole.getExpression();

            ShowResult.show(EquationSolving.solveAnEquation(expression));

    }
}
