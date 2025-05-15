package Strategy;
/**
 * Comportamento Defensivo.
 * <p>
 * Esta classe implementa a interface {@code Comportamento}, representando um comportamento específico
 * de movimento para um agente ou objeto que se move de forma defensiva, priorizando a segurança e proteção.
 * </p>
 * <p>
 * O padrão Strategy permite que o comportamento de movimento seja alterado dinamicamente. Esta classe
 * representa uma das possíveis implementações desse movimento, no caso, o movimento defensivo.
 * </p>
 *
 * @author Mateus Lima
 */
public class ComportamentoDefensivo implements Comportamento{
    /**
     * Implementação do comportamento de movimento defensivo.
     * <p>
     * Este método sobrescreve o método {@code mover()} da interface {@code Comportamento} para
     * exibir a mensagem indicando que o movimento é defensivo.
     * </p>
     */
    @Override
    public void mover() {
        System.out.println("Está movendo defensivamente!");
    }
}
