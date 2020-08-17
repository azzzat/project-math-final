package com.company;

import EquationSolving.EquationSolving;
import Exceptions.NullDenominatorException;
import Exceptions.WrongSymbolException;
import ShowResult.ShowResult;
import WorkWithConsole.WorkWithConsole;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws WrongSymbolException, NullDenominatorException {

            System.out.println("Наберите выражение отделяя цифры и знаки пробелами и нажмите на Enter.");

            ArrayList<String> expression = WorkWithConsole.getExpression();

            ShowResult.show(EquationSolving.solveAnEquation(expression));

    }
}
