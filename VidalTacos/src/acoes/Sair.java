/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package acoes;

import io.Gravador;
import io.LeitorGravadorObj;
import io.excecoes.ErroDeGravacaoException;
import objetos.VidalTacos;

/*Autor: Leonardo Gabriel Mercurio Lino // RGA: 2018.0743.040-5*/

public class Sair {
    /*ESTE MÉTODO CHAMA A FUNÇÃO PARA GRAVAR OS DADOS DO PARKHOUR E ENTÃO ENCERRA O PROGRAMA*/
    public void encerraPrograma(VidalTacos vidalTacos) throws ErroDeGravacaoException{
        Gravador.gravarBase(new LeitorGravadorObj(), vidalTacos);
        System.exit(0);
    }
}
