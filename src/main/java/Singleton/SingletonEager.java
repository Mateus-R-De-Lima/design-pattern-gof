package Singleton;

/**
 * Padrão de projeto Singleton - Versão "Eager" (Inicialização antecipada)
 *
 * <p>
 * O padrão Singleton garante que uma classe tenha apenas uma instância e fornece
 * um ponto de acesso global a essa instância.
 * </p>
 *
 * <p>
 * Na versão "Eager", a instância é criada no momento da carga da classe, ou seja,
 * antes mesmo de ser utilizada.
 * </p>
 *
 * <p><b>Vantagens:</b> Simples e thread-safe por natureza, pois a instância é criada
 * de forma estática e antecipada.</p>
 * <p><b>Desvantagens:</b> Pode desperdiçar recursos caso a instância nunca seja usada.</p>
 *
 * @author Mateus Lima
 */
public class SingletonEager {
    // Instância é criada no momento da carga da classe
    private static SingletonEager instancia = new SingletonEager();
    // Construtor privado evita que outras classes criem novas instâncias
    private SingletonEager(){
        super();
    }
    /**
     * Método de acesso à instância única da classe.
     * Como a instância já foi criada, apenas a retorna.
     *
     * @return instância única de SingletonEager
     */
    public static SingletonEager getInstance(){
        return instancia;
    }
}
