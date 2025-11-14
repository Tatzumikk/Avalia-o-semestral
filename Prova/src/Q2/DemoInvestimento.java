package Q2;

/**
 * Classe principal (Cliente) para demonstrar o padrão Strategy.
 */
public class DemoInvestimento {
    public static void main(String[] args) {
        
        PlataformaAnalise plataforma = new PlataformaAnalise("Cliente Ana Souza", 15000.00);

        // 1. O consultor define a análise como Conservadora
        plataforma.setStrategy(new CalculoConservadorStrategy());
        plataforma.analisarCliente();

        // 2. O cliente pede uma simulação Agressiva
        // A plataforma (Contexto) não muda, apenas a estratégia injetada.
        plataforma.setStrategy(new CalculoAgressivoStrategy());
        plataforma.analisarCliente();
    }
}
