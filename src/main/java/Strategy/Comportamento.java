package Strategy;
/**
 * Interface Comportamento.
 * <p>
 * Define o contrato para os diferentes comportamentos de movimento que podem ser usados em uma classe.
 * O padrão Strategy permite que os comportamentos sejam alterados dinamicamente, sem a necessidade de modificar
 * o código da classe que usa esses comportamentos.
 * </p>
 *
 * <p>
 * Neste exemplo, a interface {@code Comportamento} define um único método {@code mover()}, que será
 * implementado por diferentes estratégias de movimento.
 * </p>
 *
 * @author Mateus Lima
 */
public interface Comportamento {
    /**
     * Método para realizar o movimento.
     * <p>
     * Este método será implementado pelas classes que representam comportamentos específicos de movimento.
     * </p>
     */
    void mover();
}
