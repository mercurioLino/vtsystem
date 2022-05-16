
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
        
        try{
            //CARREGA O ARQUIVO SALVO DO PARKHOUR
            VidalTacos vidalTacos = Carregador.carregarBase(new LeitorGravadorObj());
            
            //SE A EMPRESA FOR NULA ENTÃO CRIA UMA NOVA EMPRESA
            if (vidalTacos == null) {
                vidalTacos = new VidalTacos();
            }
            try{
                //CRIA O OBJETO DO MENUPRINCIPAL
                TelaAcesso telaAcesso = new TelaAcesso(vidalTacos);
                
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "ERRO INESPERADO: " + ex, "Parkhour", 2);
            }
            
     
        //CATCHES PARA TRATAR OS POSSÍVEIS ERROS  DE ARQUIVO
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Problema de persistência: " + ex.getMessage(), "VIDAL TACOS", 2);
                
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado durante a execucao do programa" + ex.getMessage(), "VIDAL TACOS", 2);
        }
    }
}
