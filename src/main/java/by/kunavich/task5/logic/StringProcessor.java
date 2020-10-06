/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.kunavich.task5.logic;


import by.kunavich.task5.model.Array;

/**
 *
 * @author Lord
 */
public class StringProcessor {

    public String processWithString(String str)
    {
        StringBuilder stringBuilder= new StringBuilder();
        for (int i=0; i<str.length();i++) {
            if((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')||
                    (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') ||
                    (str.charAt(i) == ' '))
                stringBuilder.append(str.charAt(i));


        }
        return stringBuilder.toString();
    }



}
