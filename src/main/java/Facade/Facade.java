package Facade;

import Facade.SubSistema1.CrmService;
import Facade.SubSistema2.CepApi;

/**
 * Classe que implementa o padrão de projeto estrutural **Facade (Fachada)**.
 *
 * Finalidade:
 *  - Fornece uma interface simplificada para interação com múltiplos subsistemas.
 *  - Oculta a complexidade dos subsistemas CRM e API de CEP.
 *  - Centraliza a lógica de orquestração de operações compostas (como a migração de cliente).
 *
 * Vantagens:
 *  - Reduz o acoplamento entre cliente e os subsistemas internos.
 *  - Facilita manutenção, testes e evolução do sistema.
 *  - Torna o código mais legível e de fácil uso por outros desenvolvedores.
 *
 * Contexto:
 *  - O cliente da aplicação não precisa saber como a cidade e estado são recuperados nem como o cliente é salvo.
 *  - Tudo é abstraído através da chamada de um único método da fachada.
 */
public class Facade {

    /**
     * Método de alto nível que simula a migração de um cliente para o sistema da empresa.
     *
     * Funcionalidades que ele encapsula:
     *  1. Consulta de cidade e estado a partir do CEP usando o subsistema CepApi.
     *  2. Registro do cliente no sistema de CRM via CrmService.
     *
     * O cliente da aplicação (usuário final ou outra camada) só precisa chamar este método
     * passando nome e CEP, sem conhecer as classes internas.
     *
     * @param nome Nome do cliente a ser migrado.
     * @param cep  CEP do cliente para obtenção de cidade e estado.
     */
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);

        // Envio dos dados para o subsistema de CRM
        CrmService.gravarCliente(nome,cep,cidade,estado);
    }
}
