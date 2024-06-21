package com.felipe.tarefa5;
    
import java.util.Date;

public class Passagem {

    private Integer tag;
    private Date horario;
    private String placa;
    private String praca;
    private Double tarifa;
      
    public Passagem(Integer tag, Date horario, String placa, String praca, Double tarifa) {
        this.tag = tag;
        this.horario = horario;
        this.placa = placa;
        this.praca = praca;
        this.tarifa = tarifa;
    }

    @Override
    public String toString() {
        return "Passagem{" + "Tag=" + tag + ", horario=" + horario + ", Praça" + praca + ", Tarifa" + tarifa + '}';
    }

    public Integer getTag() {
        return tag;
    }

    public void setTag(Integer tag) {
        this.tag = tag;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPraca() {
        return praca;
    }

    public void setPraca(String praca) {
        this.praca = praca;
    }

    public Double getTarifa() {
        return tarifa;
    }

    public void setTarifa(Double tarifa) {
        this.tarifa = tarifa;
    }   
    
}
