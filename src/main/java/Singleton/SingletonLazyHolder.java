package Singleton;
/**
 * Padrão de projeto Singleton - Versão "Lazy Holder" (Bill Pugh)
 *
 * <p>
 * Esta é uma das maneiras mais eficientes e seguras de implementar o padrão Singleton em Java.
 * Utiliza uma classe interna estática para garantir que a instância seja criada apenas quando
 * o método {@code getInstance()} for chamado pela primeira vez (lazy initialization).
 * </p>
 *
 * <p>
 * A JVM garante que a inicialização da classe interna seja thread-safe, tornando
 * essa abordagem segura em ambientes concorrentes, sem a necessidade de sincronização explícita.
 * </p>
 *
 * <p><b>Vantagens:</b> Lazy, thread-safe, e eficiente.</p>
 * <p><b>Desvantagens:</b> Pode parecer menos intuitiva à primeira vista.</p>
 *
 * @author Mateus Lima
 */
public class SingletonLazyHolder {
    /**
     * Classe interna estática responsável por segurar a instância da classe externa.
     * Esta classe só será carregada pela JVM quando for realmente usada,
     * ou seja, quando {@code getInstance()} for chamado.
     */
    private static class Holder{
        private  static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    // Construtor privado impede criação de instâncias externas
    private  SingletonLazyHolder(){
        super();
    }
    /**
     * Método público de acesso à instância Singleton.
     * Quando chamado pela primeira vez, carrega a classe interna e cria a instância.
     *
     * @return instância única de SingletonLazyHolder
     */
    public  static SingletonLazyHolder getInstance(){
        return Holder.instancia;
    }
}
