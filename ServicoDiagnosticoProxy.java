import java.util.HashMap;
import java.util.Map;

// Proxy
public class ServicoDiagnosticoProxy implements ServicoDiagnostico {
    private ServicoDiagnosticoReal servicoReal;
    private Map<String, String> cache = new HashMap<>();

    @Override
    public String obterDados(String veiculoId) {
        if (!verificarPermissao()) {
            throw new SecurityException("Acesso negado!");
        }

        if (cache.containsKey(veiculoId)) {
            return cache.get(veiculoId);
        }

        if (servicoReal == null) {
            servicoReal = new ServicoDiagnosticoReal();
        }

        String dados = servicoReal.obterDados(veiculoId);
        cache.put(veiculoId, dados);
        return dados;
    }

    private boolean verificarPermissao() {
        // Lógica de verificação de permissões
        return true;
    }
}
