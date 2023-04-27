package teds.herancapoliformismo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cliente x = new Cliente();
        Funcionario y = new Funcionario();

        y.setNome("João Silva");
        y.setCpf("12345678901");
        y.setDataNascimento(LocalDate.of(1990, 07, 31));
        y.setTipoContratacao("CLT");
        y.setCargaHoraria(44);
        y.setSalario(2556.85);
        y.setDataInicioEmprego(LocalDate.of(2020, 03, 05));
        y.pegarInformacoesFuncionario();

        System.out.println();

        x.setNome("Maria Silva");
        x.setCpf("12345678902");
        x.setDataNascimento(LocalDate.of(1985, 04, 10));
        x.setDataCadastro(LocalDate.of(2022, 06, 15));
        x.setProdutoMaisComprado("Shampoo Lavou Caiu");
        x.setFuncPreferidoAntedimento(y);
        x.pegarInformacoesCliente();

    }
}
