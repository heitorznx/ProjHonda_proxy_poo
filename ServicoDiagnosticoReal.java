// Serviço Real
public class ServicoDiagnosticoReal implements ServicoDiagnostico {
    @Override
    public String obterDados(String veiculoId) {
        // Acesso complexo ao servidor remoto
        return "Dados sensíveis do veículo " + veiculoId;
    }
}
