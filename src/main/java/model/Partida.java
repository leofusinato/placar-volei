package model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Leonardo
 */
public class Partida {
    
    private List<SetJogo> setsJogo;

    public Partida() {
        this.setsJogo = new ArrayList<>();
    }

    public List<SetJogo> getSetsJogo() {
        return setsJogo;
    }

    public void addSetJogo(SetJogo setJogo) {
        this.setsJogo.add(setJogo);
    }
    
    public String getHistorico() {
        String retorno = "";
        for(SetJogo setJogo : this.setsJogo) {
            retorno = retorno + setJogo.toString() + "\n";
        }
        return retorno;
    }
    
    public void updateNomeEquipeA(String novoNome) {
        for(SetJogo setJogo : this.setsJogo) {
            setJogo.setEquipeA(novoNome);
        }
    }
    
    public void updateNomeEquipeB(String novoNome) {
        for(SetJogo setJogo : this.setsJogo) {
            setJogo.setEquipeB(novoNome);
        }
    }
    
    public void clear() {
        this.setsJogo.clear();
    }
    
}