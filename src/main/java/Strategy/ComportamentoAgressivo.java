package Strategy;
/**
 * Comportamento Agressivo.
 * <p>
 * Esta classe implementa a interface {@code Comportamento}, representando um comportamento específico
 * de movimento para um agente ou objeto que se move de forma agressiva.
 * </p>
 * <p>
 * O padrão Strategy permite que o comportamento de movimento seja alterado dinamicamente, e essa classe
 * representa uma das possíveis implementações desse movimento.
 * </p>
 *
 * @author Mateus Lima
 */
public class ComportamentoAgressivo implements Comportamento{
    /**
     * Implementação do comportamento de movimento agressivo.
     * <p>
     * Este método sobrescreve o método {@code mover()} da interface {@code Comportamento} para
     * exibir a mensagem indicando que o movimento é agressivo.
     * </p>
     */
    @Override
    public void mover() {
        System.out.println("Está movendo agressivamente!");
    }
}
