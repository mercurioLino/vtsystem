
import database.Database;
import front.gui.TelaAcesso;
import io.Carregador;
import io.LeitorGravadorObj;
import java.io.IOException;
import javax.swing.JOptionPane;
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
        Database database = new Database();
        TelaAcesso telaAcesso = new TelaAcesso(database); 
    }
}
