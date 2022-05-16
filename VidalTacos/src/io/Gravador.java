/*Autor: Leonardo Gabriel Mercurio Lino // RGA: 2018.0743.040-5*/

package io;

import io.excecoes.ErroDeGravacaoException;
import objetos.VidalTacos;



public class Gravador {
    
    //ESTE MÉTODO SERVE PARA GRAVAR OS DADOS NO ARQUIVO CRIADO
    public static void gravarBase(LeituraGravacao arq, VidalTacos vidalTacos) throws ErroDeGravacaoException{
        arq.gravarVidalTacos(vidalTacos);
    }
    
}
