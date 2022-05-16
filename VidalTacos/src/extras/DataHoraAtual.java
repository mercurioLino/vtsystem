/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package extras;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/*Autor: Leonardo Gabriel Mercurio Lino // RGA: 2018.0743.040-5*/

public class DataHoraAtual{
    
    public static void mostraTempo(JLabel lHora, JLabel lData){
        
        Thread threadData = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    String stringData = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
                    String stringHora = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
                    try {
                        lHora.setText(String.valueOf(stringHora));
                        lData.setText(String.valueOf(stringData));
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(DataHoraAtual.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
            }
        });
        threadData.start();
    }
}
