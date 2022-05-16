/*Autor: Leonardo Gabriel Mercurio Lino // RGA: 2018.0743.040-5*/

package io;

import io.excecoes.ErroDeGravacaoException;
import io.excecoes.ErroDeLeituraException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import objetos.VidalTacos;

public class LeitorGravadorObj implements LeituraGravacao{
    
    /*ESTE MÉTODO CHAMA UM FILE DIR, DEPOIS, VERIFICA SE ELE EXISTE, SE NÃO EXISTIR, CRIA ELE, DEPOIS, CRIA UM OBJETO DO TIPO OBJECTOUTPUTSTREAM
    QUE É UTILIZADO PARA CRIAR UM ARQUIVO .DAT NO DIRETÓRIO CHAMADO ACIMA, E ESCREVE OS NOVOS DADOS DA EMPRESA NELE, E LANÇA EXCEÇÕES QUANDO NECESSÁRIO, POR ULTIMO,
    FECHA O OBJETO PARA ELE PARAR DE GRAVAR*/
    @Override
    public void gravarVidalTacos(VidalTacos vidalTacos) throws ErroDeGravacaoException{
        File dir = new File("./dados");
        if(!dir.exists()){
            dir.mkdir();
        }
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("./dados/vidaltacos.dat"));
            out.writeObject(vidalTacos);
        } catch (IOException ex) {
            throw new ErroDeGravacaoException();
        }finally{
            try {
                out.close();
            } catch (IOException ex) {
                throw new ErroDeGravacaoException();
            }
        }
        
        
    }
    
    /*ESTE MÉTODO CHAMA O ARQUIVO QUE CONTÉM OS DADOS DO PARKHOUR, VERIFICA SE ELE EXISTE, CASO NÃO, RETORNA NULL, SE EXISTIR, CRIAM OBJETOS DO TIPO EMPRESA
    E DO TIPO OBJECTINPUTSTREAM, DEPOIS, NO OBJETO INPUTSTREAM ARMAZENA OS DADOS QUE EXISTIAM NO ARQUIVO, DEPOIS, CONVERTE ELES PARA UM OBJETO DO TIPO
    EMPRESA E PASSA PARA A VARIAVEL CRIADA, LANÇA EXCEÇÕES EM CASOS DE ERRO, FECHA O ARQUIVO E POR ULTIMO RETORNA O PARKHOUR LIDO*/
    @Override
    public VidalTacos lerVidalTacos() throws ErroDeLeituraException, ClassNotFoundException{
       
        File dados = new File("./dados/vidaltacos.dat");
        if(!dados.exists()){
            return null;
        }
        ObjectInputStream in = null;
        VidalTacos vidalTacos = null;
        try {
            in = new ObjectInputStream(new FileInputStream(dados));
            vidalTacos = (VidalTacos)in.readObject();
        } catch (IOException ex) {
            throw new ErroDeLeituraException();
        }finally{
            try {
                in.close();
            } catch (IOException ex) {
                throw new ErroDeLeituraException();
            }
        }
        
        return vidalTacos;
    }
}
