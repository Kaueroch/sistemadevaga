import java.util.Scanner;

public class pessoasvagapretensaosalarial {
    String nome;
    String vagas;
   double pretensaosalarial;
    public void verifica(String nome,String vagas, int pretensaosalarial){
        this.nome = nome;
        this.vagas = vagas;
        this.pretensaosalarial = pretensaosalarial;
    }
    public void perguntas(){
       Scanner sc = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        nome = sc.nextLine();
        System.out.println("QUal vaga você esta prestando?");
        vagas = sc.nextLine();
        System.out.println("Qual o salario que voce deseja?");
        pretensaosalarial = sc.nextDouble();
    }
      public void Apresentações(){
        System.out.println("Olá," + nome + "!" + "Seja bem-vindo");
        System.out.println(vagas);
       if(pretensaosalarial > 6.000){
            System.out.println("Salário Perfeito para nós");
       }else if(pretensaosalarial < 12.000){
           System.out.println("Podemos negociar!!");
       }else{
           System.out.println("Salário muito alto!");
       }

    }
}

