/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package acoes;

import javax.swing.JTextField;

/**
 *
 * @author leona
 */
public class RetornaTextoTextField {
    
    public static String retornaTextoTextField(JTextField label) {
        String retorno = "";
        if(label.getText() != ""){
            retorno = label.getText();
        }
        return retorno;
    }
}
