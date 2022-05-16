/*Autor: Leonardo Gabriel Mercurio Lino // RGA: 2018.0743.040-5*/

package io;

import io.excecoes.ErroDeGravacaoException;
import io.excecoes.ErroDeLeituraException;
import objetos.VidalTacos;

public interface LeituraGravacao {
    
    //MÉTODOS QUE SÃO IMPLEMENTADOS NO LEITORGRAVADOROBJ
    public abstract void gravarVidalTacos(VidalTacos vidalTacos) throws ErroDeGravacaoException;
    
    public abstract VidalTacos lerVidalTacos() throws ErroDeLeituraException, ClassNotFoundException;
    
}
