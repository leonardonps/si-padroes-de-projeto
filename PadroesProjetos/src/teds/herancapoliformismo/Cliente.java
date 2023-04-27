package teds.herancapoliformismo;

import java.time.LocalDate;

public class Cliente extends Pessoa {
    private LocalDate dataCadastro;
    private String produtoMaisComprado;
    private Funcionario funcPreferidoAntedimento;

    public Cliente() {
    }

    public Cliente(String nome, String cpf, LocalDate dataNascimento,
                   LocalDate dataCadastro, String produtoMaisComprado,
                   Funcionario funcPreferidoAntedimento) {
        super(nome, cpf, dataNascimento);
        this.dataCadastro = dataCadastro;
        this.produtoMaisComprado = produtoMaisComprado;
        this.funcPreferidoAntedimento = funcPreferidoAntedimento;
    }

    public void pegarInformacoesCliente(){
        System.out.println(" ---- Clientes ---- ");
        this.pegarInformacoesPessoa();
        System.out.println("Data do cadastro do cliente: " + this.getDataCadastro());
        System.out.println("Produto mais comprado pelo cliente: " + this.getProdutoMaisComprado());
        System.out.println("Funcionário preferido pelo " +
                "cliente na hora do atendimento: " + this.getFuncPreferidoAntedimento().getNome());
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getProdutoMaisComprado() {
        return produtoMaisComprado;
    }

    public void setProdutoMaisComprado(String produtoMaisComprado) {
        this.produtoMaisComprado = produtoMaisComprado;
    }

    public Funcionario getFuncPreferidoAntedimento() {
        return funcPreferidoAntedimento;
    }

    public void setFuncPreferidoAntedimento(Funcionario funcPreferidoAntedimento) {
        this.funcPreferidoAntedimento = funcPreferidoAntedimento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "dataCadastro=" + dataCadastro +
                ", produtoMaisComprado='" + produtoMaisComprado + '\'' +
                ", funcPreferidoAntedimento=" + funcPreferidoAntedimento +
                '}';
    }
}
