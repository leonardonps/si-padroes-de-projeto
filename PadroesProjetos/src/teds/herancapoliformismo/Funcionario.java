package teds.herancapoliformismo;

import java.time.LocalDate;

public class Funcionario extends Pessoa{

    private double salario;
    private int cargaHoraria;
    private String tipoContratacao;
    private LocalDate dataInicioEmprego;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, LocalDate dataNascimento,
                       double salario, int cargaHoraria, String tipoContratacao,
                       LocalDate dataInicioEmprego) {
        super(nome, cpf, dataNascimento);
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
        this.tipoContratacao = tipoContratacao;
        this.dataInicioEmprego = dataInicioEmprego;
    }

    public void pegarInformacoesFuncionario(){
        System.out.println(" ---- Funcionários ---- ");
        this.pegarInformacoesPessoa();
        System.out.printf("Salário: %.2f\n", salario);
        System.out.printf("Carga horária: %d semanais\n", this.getCargaHoraria());
        System.out.println("Tipo de contratação: " + this.getTipoContratacao());
        System.out.println("Data do início do emprego: " + this.getDataInicioEmprego());
    }

    public void realizarVenda(){
        System.out.println("Realizando Venda...");
    }

    public double getSalario() {

        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getTipoContratacao() {
        return tipoContratacao;
    }

    public void setTipoContratacao(String tipoContratacao) {
        this.tipoContratacao = tipoContratacao;
    }

    public LocalDate getDataInicioEmprego() {
        return dataInicioEmprego;
    }

    public void setDataInicioEmprego(LocalDate dataInicioEmprego) {
        this.dataInicioEmprego = dataInicioEmprego;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "salario=" + salario +
                ", cargaHoraria=" + cargaHoraria +
                ", tipoContratacao='" + tipoContratacao + '\'' +
                ", dataInicioEmprego=" + dataInicioEmprego +
                '}';
    }
}
