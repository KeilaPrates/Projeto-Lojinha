package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ProdutoImportado;
import br.com.lojinha.pojo.ProdutoNacional;
import br.com.lojinha.pojo.itensAdicionais;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto("Ventilador Mondial", Tamanho.MEDIO);

        meuProduto.setNome("Play Station 5");
        meuProduto.setValor(0);

        List<itensAdicionais> itensIncluso = new ArrayList<>();

        itensAdicionais primeiroItenAdicional = new itensAdicionais("Controle Remoto", 2);
        itensIncluso.add(primeiroItenAdicional);


        itensAdicionais segundoItensAdicionais = new itensAdicionais("Jogos", 3);
        itensIncluso.add(segundoItensAdicionais);

        itensAdicionais terceiroItensAdicionais = new itensAdicionais("Cabo de Energia", 2);
        itensIncluso.add(terceiroItensAdicionais); //3

        meuProduto.setItensIncluso(itensIncluso);

        // Imprimir na tela ----->
        System.out.println(meuProduto.getItensIncluso());
        System.out.println(meuProduto.getTamanho());
        System.out.println(meuProduto.getValor());
        System.out.println(meuProduto.getMarca());

        System.out.println("-------- LAÇOS ---------");

        for (itensAdicionais itemAtual : meuProduto.getItensIncluso()) {
            System.out.println(itemAtual.getNome());
            System.out.println(itemAtual.getQuantidade());

        }

        System.out.println("------- FIM -------");

        System.out.println(" - - -IMPOSTO NACIONAL - - -");
        ProdutoNacional meuProdutoNacional = new ProdutoNacional("Sony", Tamanho.MEDIO);
        meuProdutoNacional.setImpostoNacional(0.345);
        System.out.println(meuProdutoNacional.getImpostoNacional());
        System.out.println("- - - - - - ");

        System.out.println("----- IMPOSTO INTERNACIONAL ------");
        ProdutoImportado meuProdutoImportado = new ProdutoImportado("Som", Tamanho.PEQUENO);
        meuProdutoImportado.setTaxaDeImportacao(0.576);
        System.out.println(meuProdutoImportado.getTaxaDeImportacao());
        System.out.println("--------------");

    }
}
