package Q1;

/**
 * Classe principal (Cliente) para demonstrar o padrão Strategy.
 */
public class DemoLogistica {
    public static void main(String[] args) {
        
        SistemaDeRelatorios sistema = new SistemaDeRelatorios();

        // 1. Gerar relatório diário
        sistema.setStrategy(new RelatorioDiarioStrategy());
        sistema.executarGeracao();

        // 2. Mudar dinamicamente para o relatório semanal
        sistema.setStrategy(new RelatorioSemanalStrategy());
        sistema.executarGeracao();

    }
}
