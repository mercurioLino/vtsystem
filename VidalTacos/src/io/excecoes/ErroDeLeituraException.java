/*Autor: Leonardo Gabriel Mercurio Lino // RGA: 2018.0743.040-5*/

package io.excecoes;

import java.io.IOException;

public class ErroDeLeituraException extends IOException{
    //ESTE MÉTODO LANÇA UMA EXCEÇÃO QUANDO CHAMADO
    public ErroDeLeituraException(){
        super("Erro de leitura");
    }
}
