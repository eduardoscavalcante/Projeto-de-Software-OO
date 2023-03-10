/*1) Permitir a criação e remoção de informações referentes aos produtos, movimentações e funcionários/responsáveis;
2) Permitir a edição de informações referentes aos produtos, movimentações e funcionários/responsáveis;
3) Permitir a associação de produto a uma localidade do estoque;
4) Permitir a alteração do status
• “Em estoque”, “Sem estoque”, “quantidade” etc.*/

package classes;

import java.util.Scanner;

public class Vendedor extends Funcionarios{

    private int idVendedor;

    Scanner input = new Scanner(System.in);

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public int getIdVendedor() {
        return idVendedor;
    }
    
    public void imp_e() {

        if (getId() != -1) {
            System.out.println("********RELATÓRIO DO FUNCIONÁRIO:*********");
            System.out.println("Identificação: " + getId());
            System.out.println("Nome: " + getNome());
            System.out.println("Email: " + getEmail());
            System.out.println("Telefone: " + getTelefone());
            System.out.println("CPF: " + getCPF());
            System.out.println("Cargo: " + getCargo());
            System.out.println("******************************************");
        } else {
            System.out.println("Funcionario não existente");
        }
        System.out.println();
    }

    public void add_e(int ficha) {// Adição de um empregado

        long aux1;
        String aux2;

        setId(ficha);
        System.out.println("Informe o Nome Completo: ");
        aux2 = input.nextLine();
        setNome(aux2);
        System.out.println("Informe o Email: ");
        aux2 = input.nextLine();
        setEmail(aux2);
        System.out.println("Informe o Telefone(somente numeros): ");
        aux1 = input.nextLong();
        setTelefone(aux1);
        input.nextLine();
        System.out.println("Informe o CPF: ");
        aux1 = input.nextLong();
        setCPF(aux1);
        System.out.println("Informe o Cargo: ");
        aux2 = input.nextLine();
        setCargo(aux2);
        System.out.println();
        imp_e();
    }

    public void rem_e() {// Remoção de um empregado

        int aux1 = -1;
        String aux2 = null;

        setId(aux1);
        setNome(aux2);
        setEmail(aux2);
        setTelefone(aux1);
        setCPF(aux1);
        setCargo(aux2);
        imp_e();
    }

    public void M_Inicial() {// função de apoio

        System.out.println("Informe o campo que deseja alterar:");
        System.out.println("Nome Completo(1);\n" + "Email(2);\n" + "Telefone(3);\n" + "CPF(4);\n"
                + "Cargo(5);\n" + "Sair(6).");
    }

    public void ed_e() {// Alterar detalhes de um empregado

        int opcao = 1;
        long aux1;
        String aux2;
        double aux3;

        while (opcao != 6) {

            M_Inicial();
            opcao = input.nextInt();
            input.nextLine();
            switch (opcao) {
            case 1:
                System.out.println("Informe o Novo Nome Completo: ");
                aux2 = input.nextLine();
                setNome(aux2);
                System.out.println();
                break;
            case 2:
                System.out.println("Informe o Novo Email: ");
                aux2 = input.nextLine();
                setEmail(aux2);
                System.out.println();
                break;
            case 3:
                System.out.println("Informe o Novo Telefone(somente numeros): ");
                aux1 = input.nextLong();
                setTelefone(aux1);
                input.nextLine();
                System.out.println();
                break;
            case 4:
                System.out.println("Informe o Novo CPF(somente numeros): ");
                aux1 = input.nextLong();
                setCPF(aux1);
                input.nextLine();
                System.out.println();
                break;
            case 5:
                System.out.println("Informe o Novo Cargo: ");
                aux2 = input.nextLine();
                setCargo(aux2);
                System.out.println();
                break;
            case 6:
                System.out.println("Modificações Salvas!!");
                System.out.println();
                break;
            default:
                System.out.println("Opção Invalida!!!");
                System.out.println("Digite Novamente");
                System.out.println();
            }
        }
        imp_e();
    }


}
