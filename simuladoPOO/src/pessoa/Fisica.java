package pessoa;

import java.util.Scanner;

public class Fisica extends PessoaAbstract implements PessoaInterface {

    String cpf;
    String filiacao;

    public Fisica() {
    }

    public Fisica(String nome, String telefone, String endereco, Float valorMensal, Float valorFatura) {
        super(nome, telefone, endereco, valorMensal, valorFatura);
    }

    @Override
    public Float faturar() {
        return  (getValorMensal()+(getValorMensal()*0.125f));
    }


    @Override
    public void telaEntradaDados() {

        Scanner input = new Scanner(System.in);

        System.out.println(" Nome Pessoa Fisica: ");
        setNome(input.nextLine());

        System.out.println("Cpf: ");
        setCpf(input.nextLine());

        System.out.println("Filiacao: ");
        setFiliacao(input.nextLine());


        System.out.println("Endereço:");
        setEndereco(input.nextLine());

        System.out.println("Telefone:");
        setTelefone(input.nextLine());

        System.out.println("Valor Mensal: ");
        setValorMensal(input.nextFloat());



    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFiliacao() {
        return filiacao;
    }

    public void setFiliacao(String filiacao) {
        this.filiacao = filiacao;
    }

}
