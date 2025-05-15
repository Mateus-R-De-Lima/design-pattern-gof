package Strategy;
/**
 * Comportamento Normal.
 * <p>
 * Esta classe implementa a interface {@code Comportamento}, representando um comportamento específico
 * de movimento para um agente ou objeto que se move de maneira padrão ou normal.
 * </p>
 * <p>
 * O padrão Strategy permite que o comportamento de movimento seja alterado dinamicamente, e esta classe
 * representa uma das possíveis implementações desse movimento, ou seja, o movimento normal.
 * </p>
 *
 * @author Mateus Lima
 */
public class ComportamentoNormal implements Comportamento{
    /**
     * Implementação do comportamento de movimento normal.
     * <p>
     * Este método sobrescreve o método {@code mover()} da interface {@code Comportamento} para
     * exibir a mensagem indicando que o movimento é normal.
     * </p>
     */
    @Override
    public void mover() {
        System.out.println("Esta movendo normalmente.");
    }
}
