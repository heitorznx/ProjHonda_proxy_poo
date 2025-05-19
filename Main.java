public class Main {
    public static void main(String[] args) {
        ServicoDiagnostico servico = new ServicoDiagnosticoProxy();

        System.out.println(servico.obterDados("Honda123"));
        System.out.println(servico.obterDados("Honda123")); // Deve vir do cache
    }
}
