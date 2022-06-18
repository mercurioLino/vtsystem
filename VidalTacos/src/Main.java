import front.gui.TelaAcesso;

import database.Database;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author leonardolino
 */
public class Main {
    public static void main(String args[]) {
        Database database = new Database();
        TelaAcesso telaAcesso = new TelaAcesso(database); 
    }
}
