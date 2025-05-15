package Strategy;
// Classe principal que usa a estratégia
public class Robo {
    // A variável comportamento é o que permite ao Robo mudar sua estratégia de movimento.
    private Comportamento comportamento;

    public Robo(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover() {
        comportamento.mover(); // Delegação do movimento
    }
}
