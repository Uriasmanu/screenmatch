package br.com.alura.screenmatch.modelos;
import br.com.alura.screenmatch.calculos.Classificacao;

public class Episodio implements Classificacao {

    private int numero;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    private String nome;

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    private Serie serie;
    private int totalVisualizacoes;

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }
    @Override
    public int getClassificacao() {
        if (totalVisualizacoes > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
