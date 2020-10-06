/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.kunavich.task5.data.dataAcquirer;


import by.kunavich.task5.data.DataException;
import by.kunavich.task5.model.Array;

/**
 *
 * @author Lord
 */
public interface DataAcquirer {
    String getData() throws DataException;
    
}
