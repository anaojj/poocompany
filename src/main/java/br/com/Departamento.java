package br.com;

import java.util.ArrayList;

public class Departamento {
    private String nome;
    private ArrayList<Funcionario> funcionarios;

    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void addFuncionario(Funcionario funcionario) {
        if (funcionarios.size() < 100) {
            funcionarios.add(funcionario);
            System.out.println("Funcionário adicionado com sucesso");
        } else {
            System.out.println("Limite de 100 funcionários atingido");
        }
    }

    public void removeFuncionario(Funcionario funcionario) {
        funcionarios.remove(funcionario);
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void darAumento(int i) {
        throw new UnsupportedOperationException("Unimplemented method 'darAumento'");
    }

    public void transferirFuncionario(Departamento dep2, Funcionario funcionario2) {
        throw new UnsupportedOperationException("Unimplemented method 'transferirFuncionario'");
    }
}