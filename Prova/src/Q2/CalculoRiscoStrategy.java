package Q2;

/**
 * Interface (Strategy) que define a operação padrão
 * para todos os algoritmos de cálculo de risco.
 */
public interface CalculoRiscoStrategy {
    // Retorna o nome do perfil (ex: "Conservador")
    String calcularPerfil(double valorAplicado);
}