package br.com;

public class Funcionario {
    private String nome;
    private Float salario;
    private String admissao;

    public Funcionario(String nome, Float salario, String admissao) {
        this.nome = nome;
        this.salario = salario;
        this.admissao = admissao;
    }

    public String getNome() {
        return nome;
    }

    public Float getSalario() {
        return salario;
    }

    public String getAdmissao() {
        return admissao;
    }

    public void reajustarSalario() {
        salario *= 1.1f;
    }
}