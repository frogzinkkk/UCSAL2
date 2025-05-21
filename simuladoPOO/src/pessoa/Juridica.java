package pessoa;
import java.util.Scanner;

public class Juridica extends PessoaAbstract {

    private String cnpj;
    private String nomeFantasia;
    public Juridica() {
    }

    public Juridica(String nome, String telefone, String endereco, Float valorMensal, Float valorFatura, String cnpj,  String nomeFantasia) {
        super(nome, telefone, endereco, valorMensal, valorFatura);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }



    @Override
    public Float faturar() {

        return (getValorMensal()+ (getValorMensal()*0.035f));
    }

    @Override
    public void telaEntradaDados() {
        Scanner input = new Scanner(System.in);

        System.out.println(" Nome Pessoa juridica: ");
        setNome(input.nextLine());

        System.out.println(" Nome Fantasia: ");
        setNomeFantasia(input.nextLine());

        System.out.println("Cnpj: ");
        setCnpj(input.nextLine());


        System.out.println("Endereço:");
        setEndereco(input.nextLine());

        System.out.println("Telefone:");
        setTelefone(input.nextLine());

        System.out.println("Valor Mensal: ");
        setValorMensal(input.nextFloat());



    }


    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
}
