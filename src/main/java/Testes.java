import Facade.Facade;
import Singleton.SingletonEager;
import Singleton.SingletonLazy;
import Singleton.SingletonLazyHolder;
import Strategy.ComportamentoAgressivo;
import Strategy.ComportamentoDefensivo;
import Strategy.ComportamentoNormal;
import Strategy.Robo;

public class Testes {

    public static void main(String[] args) {
        testarSingletons();
        System.out.println("\n=========================================================\n");
        testarStrategy();
        System.out.println("\n=========================================================\n");
        testarFacade();

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


    /**
     * Testa o padrão Strategy com três comportamentos:
     * normal, defensivo e agressivo.
     * <p>
     * O padrão Strategy permite que o comportamento de um objeto seja alterado
     * dinamicamente em tempo de execução, sem a necessidade de modificar sua classe.
     * Neste teste, temos um objeto {@code Robo} que executa o método {@code mover()},
     * e seu comportamento pode ser trocado em tempo real usando diferentes estratégias
     * que implementam a interface {@code Comportamento}.
     * </p>
     */
    public static void testarStrategy() {
        // Criando um robô com comportamento normal
        Robo robo = new Robo(new ComportamentoNormal());

        System.out.println("Movimento normal:");
        robo.mover();
        robo.mover();

        // Mudando para comportamento defensivo
        robo.setComportamento(new ComportamentoDefensivo());
        System.out.println("\nMovimento defensivo:");
        robo.mover();

        // Mudando para comportamento agressivo
        robo.setComportamento(new ComportamentoAgressivo());
        System.out.println("\nMovimento agressivo:");
        robo.mover();
        robo.mover();
        robo.mover();
    }

    /**
     * Classe cliente que utiliza a Facade para executar uma operação de alto nível
     * sem precisar conhecer ou lidar diretamente com os subsistemas internos.
     *
     * Esse método simula um cenário real onde um cliente é migrado para o sistema.
     * A lógica interna (busca de endereço e gravação no CRM) está abstraída pela Facade.
     */
    public static void testarFacade(){

        // Cria uma instância da fachada, que é a interface simplificada do sistema
        Facade  facade = new Facade();

        /**
         * Executa o processo de migração de cliente:
         * - O cliente final (este código de teste) só precisa fornecer o nome e o CEP.
         * - A Facade cuida de chamar os subsistemas necessários:
         *      - Consulta cidade e estado pela API de CEP
         *      - Registra o cliente no sistema de CRM
         */
        facade.migrarCliente("Mateus","03066065");
    }



}
