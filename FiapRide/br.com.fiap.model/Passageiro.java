package br.com.fiapride.model;

public class Passageiro {

    // Atributos privados: protegidos contra acesso direto
    private String nome;
    private String cpf;
    private double saldo;

    // Construtor
    public Passageiro(String nome, String cpf) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setSaldo(0);
    }

    // Getter do saldo
    public double getSaldo() {
        return this.saldo;
    }

    // Setter do saldo
    private void setSaldo(double valor) {
        if (valor >= 0) {
            this.saldo = valor;
        } else {
            System.out.println(
                "Erro de Segurança: Tentativa de definir saldo negativo bloqueada!"
            );
        }
    }

    // Getter do nome
    public String getNome() {
        return this.nome;
    }

    // Setter do nome
    private void setNome(String nome) {
        this.nome = nome;
    }

    // Getter do CPF
    public String getCpf() {
        return this.cpf;
    }

    // Setter do CPF
    private void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Adicionar saldo
    public void adicionarSaldo(double valor) {
        if (valor > 0) {
            this.setSaldo(this.saldo + valor);
            System.out.println("Saldo adicionado com sucesso!");
        } else {
            System.out.println(
                "Erro: O valor da recarga deve ser maior que zero."
            );
        }
    }

    // Pagar viagem
    public void pagarViagem(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.setSaldo(this.saldo - valor);
            System.out.println("Viagem paga com sucesso!");
        } else if (valor > this.saldo) {
            System.out.println(
                "Erro: Saldo insuficiente para realizar a viagem."
            );
        } else {
            System.out.println(
                "Erro: O valor da viagem deve ser maior que zero."
            );
        }
    }
}
