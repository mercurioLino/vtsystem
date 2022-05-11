/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos.pessoas;

import java.text.SimpleDateFormat;

/**
 *
 * @author leona
 */
public class Ponto {
    
    private Funcionario funcionario;
    private SimpleDateFormat horaEntrada ;//= new SimpleDateFormat("HH:mm");;
    private SimpleDateFormat pausaAlmoco ;//= new SimpleDateFormat("HH:mm");;
    private SimpleDateFormat voltaAlmoco ;//= new SimpleDateFormat("HH:mm");;
    private SimpleDateFormat horaSaida; //= new SimpleDateFormat("HH:mm");;
    private SimpleDateFormat extra; //= new SimpleDateFormat("HH:mm");
    private SimpleDateFormat data; //= new SimpleDateFormat("dd/MM/yyyy");

    public Ponto(Funcionario funcionario, SimpleDateFormat horaEntrada, SimpleDateFormat pausaAlmoco, SimpleDateFormat voltaAlmoco, SimpleDateFormat horaSaida, SimpleDateFormat extra, SimpleDateFormat data) {
        this.funcionario = funcionario;
        this.horaEntrada = horaEntrada;
        this.pausaAlmoco = pausaAlmoco;
        this.voltaAlmoco = voltaAlmoco;
        this.horaSaida = horaSaida;
        this.extra = extra;
        this.data = data;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public SimpleDateFormat getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(SimpleDateFormat horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public SimpleDateFormat getPausaAlmoco() {
        return pausaAlmoco;
    }

    public void setPausaAlmoco(SimpleDateFormat pausaAlmoco) {
        this.pausaAlmoco = pausaAlmoco;
    }

    public SimpleDateFormat getVoltaAlmoco() {
        return voltaAlmoco;
    }

    public void setVoltaAlmoco(SimpleDateFormat voltaAlmoco) {
        this.voltaAlmoco = voltaAlmoco;
    }

    public SimpleDateFormat getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(SimpleDateFormat horaSaida) {
        this.horaSaida = horaSaida;
    }

    public SimpleDateFormat getExtra() {
        return extra;
    }

    public void setExtra(SimpleDateFormat extra) {
        this.extra = extra;
    }

    public SimpleDateFormat getData() {
        return data;
    }

    public void setData(SimpleDateFormat data) {
        this.data = data;
    }

    
    
    
   
    
    
}
