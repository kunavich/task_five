/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.kunavich.task5;

import by.kunavich.task5.data.*;
import by.kunavich.task5.data.dataAcquirer.DataAcquirer;
import by.kunavich.task5.data.dataAcquirer.DataAcquirerFactory;
import by.kunavich.task5.logic.StringProcessor;
import by.kunavich.task5.view.ConcoleResultPrinter;
import by.kunavich.task5.view.ResultPrinter;


/**
 *
 * @author Lord
 */
public class Main {
     public static void main(String[] args) throws Exception {

         // get
         DataAcquirerFactory dataAcquirerFactory = new DataAcquirerFactory();
         DataAcquirer dataAcquirer = dataAcquirerFactory.getDataAcquirer("CONSOLE");

         String string =dataAcquirer.getData();

         //count
         StringProcessor stringProcessor = new StringProcessor();
         String withRgx =stringProcessor.processWithRgx(string);
         String withOutRgx =stringProcessor.processWithString(string);


         //out
         ResultPrinter printer= new ConcoleResultPrinter();
         printer.printResult(withRgx);
         printer.printResult(withOutRgx);


    }
}
