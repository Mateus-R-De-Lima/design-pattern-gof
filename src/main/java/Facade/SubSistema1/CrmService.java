package Facade.SubSistema1;
/**
 * Simula um sistema externo de CRM onde os dados do cliente são salvos.
 * Esta classe faz parte de um subsistema que o cliente final não precisa conhecer diretamente.
 */
public class CrmService {
    // Construtor privado para evitar instanciamento externo.
    private  CrmService(){
        super();
    }
    /**
     * Método responsável por simular o salvamento de um cliente no sistema de CRM.
     *
     * @param nome   Nome do cliente
     * @param cep    CEP do cliente
     * @param cidade Cidade do cliente (proveniente de outro subsistema)
     * @param estado Estado do cliente (proveniente de outro subsistema)
     */
    public static void gravarCliente(String nome,String cep, String cidade,String estado){
        System.out.println("Cliente salvo no sistema de CRM.");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
    }
}
