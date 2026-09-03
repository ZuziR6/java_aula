package br.com.fiapride.model;

public class Garrafa {

    // Atributos privados
    private String cor;
    private double capacidade;

    // Construtor
    public Garrafa(String cor, double capacidade) {
        this.setCor(cor);
        this.setCapacidade(capacidade);
    }

    // Getter da cor
    public String getCor() {
        return this.cor;
    }

    // Setter da cor
    private void setCor(String cor) {
        this.cor = cor;
    }

    // Getter da capacidade
    public double getCapacidade() {
        return this.capacidade;
    }

    // Setter da capacidade com regra de negócio
    private void setCapacidade(double capacidade) {
        if (capacidade >= 0 && capacidade <= 3000) {
            this.capacidade = capacidade;
        } else {
            System.out.println(
                "Erro: A capacidade deve estar entre 0 e 3000 ml."
            );
        }
    }
}
