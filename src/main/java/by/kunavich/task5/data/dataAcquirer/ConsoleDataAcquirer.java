/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.kunavich.task5.data.dataAcquirer;

import by.kunavich.task5.data.DataException;
import by.kunavich.task5.model.Array;

import java.util.Scanner;

/**
 *
 * @author Lord
 */
public class ConsoleDataAcquirer implements DataAcquirer{

    @Override
    public String getData() throws DataException {
        System.out.println("Enter array of numbers (like this 1 4 3 8)");
        try (Scanner scanner = new Scanner(System.in)){
            String input =scanner.next();


            return input;
        }



    }
}
