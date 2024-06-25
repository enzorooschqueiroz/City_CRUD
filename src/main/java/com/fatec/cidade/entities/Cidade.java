package com.fatec.cidade.entities;

public class Cidade {
    
    private Integer id;
    private String nome;
    private String estado;
    private String pop;
    private String pib;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getPop() {
        return pop;
    }
    public void setPop(String pop) {
        this.pop = pop;
    }
    public String getPib() {
        return pib;
    }
    public void setPib(String pib) {
        this.pib = pib;
    }


    
}
