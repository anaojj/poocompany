package br.com;

import java.util.ArrayList;

public class Empresa {
    private String nome;
    private String CNPJ;
    private ArrayList<Departamento> departamentos;

    public Empresa(String nome, String CNPJ) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        departamentos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public ArrayList<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void addDepartamento(Departamento departamento) {
        if (departamentos.size() < 10) {
            departamentos.add(departamento);
            System.out.println("Departamento adicionado com sucesso");
        } else {
            System.out.println("O limite de 10 departamentos foi atingido, por favor remova algum departamento para depois adicionar");
        }
    }
}