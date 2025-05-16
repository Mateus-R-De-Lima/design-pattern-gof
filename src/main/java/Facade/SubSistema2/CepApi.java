package Facade.SubSistema2;
/**
 * Simula um serviço de API externa para consulta de informações de endereço a partir do CEP.
 * Implementa o padrão Singleton para garantir uma única instância.
 */
public class CepApi {
    // Instância única da classe (Singleton)
    private  static  CepApi instancia = new CepApi();
    /**
     * Retorna a instância única da API.
     */
    private CepApi(){
        super();
    }
    /**
     * Retorna a instância única da API.
     */
    public  static  CepApi getInstance(){
        return instancia;
    }
    /**
     * Simula a recuperação da cidade com base no CEP informado.
     *
     * @param cep CEP fornecido
     * @return Cidade fictícia "Guarulhos"
     */
    public  String recuperarCidade(String cep){
        return "Guarulhos";
    }
    /**
     * Simula a recuperação do estado com base no CEP informado.
     *
     * @param cep CEP fornecido
     * @return Estado fictício "São Paulo"
     */
    public  String recuperarEstado(String cep){
        return "São Paulo";
    }
}
