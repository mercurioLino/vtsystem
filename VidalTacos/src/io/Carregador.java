/*Autor: Leonardo Gabriel Mercurio Lino // RGA: 2018.0743.040-5*/

package io;


import io.excecoes.ErroDeLeituraException;
import objetos.VidalTacos;

public class Carregador {
    
    //ESTE MÉTODO SERVE PARA CARREGAR OS DADOS DO ARQUIVO CRIADO
    public static VidalTacos carregarBase(LeituraGravacao arq) throws ErroDeLeituraException, ClassNotFoundException{
        return arq.lerVidalTacos();
    }
    
}
