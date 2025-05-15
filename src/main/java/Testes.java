import Singleton.SingletonEager;
import Singleton.SingletonLazy;
import Singleton.SingletonLazyHolder;

public class Testes {

    public static void main(String[] args) {
        testarSingletons();
    }

    /**
     * Método de teste para demonstrar o funcionamento das três implementações do padrão Singleton:
     * Lazy, Eager e LazyHolder.
     *
     * <p>
     * Cada tipo de Singleton é instanciado duas vezes, e o código imprime a referência do objeto.
     * Se o padrão estiver funcionando corretamente, as duas chamadas para cada tipo
     * devem imprimir o mesmo endereço de memória (mesmo objeto).
     * </p>
     */
    public static void testarSingletons() {
        // Teste do Singleton Lazy (instância criada sob demanda)
        System.out.println("Teste SingletonLazy:");
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy); // Deve imprimir a mesma instância
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        System.out.println("=========================================================");

        // Teste do Singleton Eager (instância criada na carga da classe)
        System.out.println("Teste SingletonEager:");
        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager); // Deve imprimir a mesma instância
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        System.out.println("=========================================================");

        // Teste do Singleton LazyHolder (instância criada de forma lazy e thread-safe)
        System.out.println("Teste SingletonLazyHolder:");
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder); // Deve imprimir a mesma instância
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
    }
}
