package Q2;

/**
 * Classe de Contexto (A plataforma de análise).
 * Mantém uma referência à estratégia de cálculo atual.
 */
public class PlataformaAnalise {
    
    private CalculoRiscoStrategy strategy;
    private String nomeCliente;
    private double valorInvestido;

    public PlataformaAnalise(String nomeCliente, double valorInvestido) {
        this.nomeCliente = nomeCliente;
        this.valorInvestido = valorInvestido;
    }

    // Permite trocar o modelo de cálculo (estratégia) dinamicamente
    public void setStrategy(CalculoRiscoStrategy strategy) {
        this.strategy = strategy;
    }

    // Delega o cálculo para o objeto de estratégia
    public void analisarCliente() {
        System.out.println("Analisando cliente: " + this.nomeCliente);
        
        if (strategy == null) {
            System.out.println("Erro: Nenhum modelo de cálculo foi definido.");
            return;
        }

        String perfil = strategy.calcularPerfil(this.valorInvestido);
        System.out.println("Resultado da Análise: Perfil " + perfil + "\n");
    }
}