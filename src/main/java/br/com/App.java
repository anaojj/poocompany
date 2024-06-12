package br.com;

public class App {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Moinhos Cruzeiro do Sul", "00-000-0000/0001-00");

        Departamento dep1 = new Departamento("Comercial");
        Departamento dep2 = new Departamento("Logística");
        Departamento dep3 = new Departamento("Contabilidade");
        Departamento dep4 = new Departamento("PCP");


        empresa.addDepartamento(dep1);
        empresa.addDepartamento(dep2);
        empresa.addDepartamento(dep3);
        empresa.addDepartamento(dep4);


        Funcionario funcionario = new Funcionario("Joana D'arc", 1700.00f, "03/03/2022");
        Funcionario funcionario2 = new Funcionario("Silvania Nascimento", 4000.00f, "17/08/2016");
        Funcionario funcionario3 = new Funcionario("Danielle Lobo", 12000.00f, "28/07/2019");

        dep1.addFuncionario(funcionario);
        dep1.addFuncionario(funcionario2);
        dep2.addFuncionario(funcionario3);

        dep1.darAumento(10);

        dep1.transferirFuncionario(dep2, funcionario2);

        System.out.println("Empresa: " + empresa.getNome());
        System.out.println("Funcionários da Empresa:");
        for (Departamento departamento : empresa.getDepartamentos()) {
            System.out.println("Departamento: " + departamento.getNome());
            for (Funcionario func : departamento.getFuncionarios()) {
                System.out.println("Nome: " + func.getNome() + " | Salario com reajuste: " + func.getSalario());
            }
        }
    }
}