package model;

/**
 * @author Leonardo
 */
public class SetJogo {
    
    private final int numero;
    private String equipeA;
    private String equipeB;
    private final int pontosA;
    private final int pontosB;

    public SetJogo(int numero, String equipeA, String equipeB, int pontosA, int pontosB) {
        this.numero = numero;
        this.equipeA = equipeA;
        this.equipeB = equipeB;
        this.pontosA = pontosA;
        this.pontosB = pontosB;
    }

    public String getEquipeA() {
        return equipeA;
    }

    public String getEquipeB() {
        return equipeB;
    }

    public void setEquipeA(String equipeA) {
        this.equipeA = equipeA;
    }

    public void setEquipeB(String equipeB) {
        this.equipeB = equipeB;
    }
    
   public String getVencedor() {
       return pontosA > pontosB ? equipeA : equipeB;
   } 
   
    @Override
    public String toString() {
        return "Set: " + numero + " --- " + equipeA + " " + pontosA + " x " + pontosB + " " + equipeB + " --- Vencedor: " + getVencedor();
    }
}