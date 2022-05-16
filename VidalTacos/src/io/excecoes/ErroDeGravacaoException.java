/*Autor: Leonardo Gabriel Mercurio Lino // RGA: 2018.0743.040-5*/

package io.excecoes;

import java.io.IOException;

public class ErroDeGravacaoException extends IOException{
    //ESTE MÉTODO LANÇA UMA EXCEÇÃO QUANDO CHAMADO
    public ErroDeGravacaoException(){
        super("Erro de gravação");
    }
    
}
