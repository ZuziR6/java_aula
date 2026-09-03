package br.com.fiapride.main;

import br.com.fiapride.model.Garrafa;

public class TesteMeuObjeto {

    public static void main(String[] args) {

        System.out.println("--- Teste do Meu Projeto Pessoal ---");

        // Criando uma garrafa válida
        Garrafa minhaGarrafa = new Garrafa("Azul", 500);

        // Lendo os dados através dos Getters
        System.out.println("Cor da garrafa: " + minhaGarrafa.getCor());
        System.out.println(
            "Capacidade: " + minhaGarrafa.getCapacidade() + "ml"
        );

        // Testando uma capacidade inválida
        System.out.println("\n--- Testando Regra de Segurança ---");

        Garrafa garrafaInvalida = new Garrafa("Vermelha", 5000);

        System.out.println(
            "Capacidade da garrafa inválida: "
            + garrafaInvalida.getCapacidade() + "ml"
        );
    }
}
