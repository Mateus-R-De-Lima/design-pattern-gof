package Singleton;
/**
 * Padrão de projeto Singleton - Versão "Preguiçosa" (Lazy)
 *
 * <p>
 * O padrão Singleton garante que uma classe tenha apenas uma instância em todo o ciclo de vida
 * da aplicação, e fornece um ponto de acesso global a essa instância.
 * </p>
 *
 * <p>
 * Na versão "Lazy" (preguiçosa), a instância é criada apenas quando for solicitada pela primeira vez.
 * Isso pode economizar recursos caso a instância não seja sempre necessária.
 * </p>
 *
 * <p><b>Vantagens:</b> Simples de implementar, instancia apenas quando necessário.</p>
 * <p><b>Desvantagens:</b> Não é thread-safe em ambientes multi-thread sem sincronização adicional.</p>
 *
 * @author Mateus Lima
 */
public class SingletonLazy {
    // Instância privada e estática da própria classe
    private static SingletonLazy instancia;
    // Construtor privado impede que outras classes instanciem diretamente
    private SingletonLazy(){
        super();
    }
    /**
     * Método público de acesso à instância Singleton.
     * Cria a instância somente quando for solicitada pela primeira vez.
     *
     * @return instância única de SingletonLazy
     */
    public static SingletonLazy getInstance(){
       if(instancia == null){
           instancia = new SingletonLazy();
       }
        return instancia;
    }

}
