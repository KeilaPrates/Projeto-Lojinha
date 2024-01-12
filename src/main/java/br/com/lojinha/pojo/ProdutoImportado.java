package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;

public class ProdutoImportado extends Produto  {
    private double taxaDeImportacao;
    public ProdutoImportado(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }
    public double getTaxaDeImportacao() {
        return taxaDeImportacao;
    }

    public void setTaxaDeImportacao(double impostoInternacion) {
        this.taxaDeImportacao = impostoInternacion;
    }
    public String getDadosFavoritos(){
        return this.getNome() + ", " + this.getMarca() + " e " + this.getValor();
    }
}
