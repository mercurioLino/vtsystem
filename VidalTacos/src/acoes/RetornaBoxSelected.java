/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package acoes;

import javax.swing.JCheckBox;

/**
 *
 * @author leona
 */
public class RetornaBoxSelected {
    public static boolean retornaBoxSelected(JCheckBox box) {
        boolean retorno = false;
        if(box.isSelected()){
            retorno = true;
        }
        return retorno;
    }
}
