package Q1;

/**
 * Classe de Contexto (O núcleo do sistema).
 * Mantém uma referência à estratégia atual e a utiliza.
 */
public class SistemaDeRelatorios {

    private RelatorioStrategy strategy;

    // Permite trocar a estratégia em tempo de execução
    public void setStrategy(RelatorioStrategy strategy) {
        this.strategy = strategy;
    }

    // Delega a ação para o objeto de estratégia
    public void executarGeracao() {
        if (strategy == null) {
            System.out.println("Erro: Nenhuma estratégia de relatório foi definida.");
            return;
        }
        strategy.gerar();
    }
}
