package tests;

import java.util.ArrayList;
import java.util.List;
import model.SetJogo;

/**
 * @author Leonardo
 */
public class TesteSetJogo {

    private static List<Teste> testes = new ArrayList<>();

    public static void main(String[] args) {
        Teste teste1 = new Teste("Vencedor equipe A");
        SetJogo set = new SetJogo(1, "Equipe A", "Equipe B", 25, 0);
        teste1.expect(set.getVencedor().equals("Equipe A"));
        
        Teste teste2 = new Teste("Vencedor equipe B");
        SetJogo set2 = new SetJogo(2, "Equipe A", "Equipe B", 0, 25);
        teste2.expect(set2.getVencedor().equals("Equipe B"));
        
        testes.add(teste1);
        testes.add(teste2);
        run();
    }
    
    private static void run() {
        testes.forEach(testeAtual -> {
            String situacao = testeAtual.succeeded() ? "Sucesso" : "Falha";
            System.out.println("Teste: " + testeAtual.getDescricao() + ". Situação: " + situacao);
        });
    }

}

class Teste {

    private String descricao;
    private boolean success;

    public Teste(String descricao) {
        this.descricao = descricao;
    }

    public void expect(boolean result) {
        if (result) {
            success = true;
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean succeeded() {
        return success;
    }
    
}
