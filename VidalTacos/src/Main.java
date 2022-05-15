
import front.gui.LoginGui;
import objetos.VidalTacos;

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
        VidalTacos vidalTacos = new VidalTacos();
        LoginGui telaAcesso = new LoginGui(vidalTacos);
    }
}
