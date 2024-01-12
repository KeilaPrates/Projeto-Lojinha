package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;

import java.util.List;

public class Produto {
    private String nome;
    private String marca;
    protected double valor;
    private Tamanho tamanho;
    private List<itensAdicionais> itensIncluso; //antes era uma lista de strings agora e e itens adicionais

    public Produto(String marcaInicial, Tamanho tamanhoInicial){
        this.marca = marcaInicial;
        this.tamanho = tamanhoInicial;
    }
    public double getValor(){
        return this.valor;
    }

    public void setValor(double novoValor){
        if (novoValor > -100){
            this.valor = novoValor;
        }else {
            throw new IllegalArgumentException("Valores devem ser maiores que -100");
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho novotamanho) {
        this.tamanho = novotamanho;
    }

    public List<itensAdicionais> getItensIncluso() {
        return itensIncluso;
    }

    public void setItensIncluso(List<itensAdicionais> novoitensIncluso) {
        this.itensIncluso = novoitensIncluso;
    }
}
