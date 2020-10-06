/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.kunavich.task5.view;

import by.kunavich.task5.model.Array;

/**
 *
 * @author Lord
 */
public class ConcoleResultPrinter implements ResultPrinter{

    @Override
    public void printResult(String str) {
        System.out.println("Processed line : "+ str);

    }
}
