package exercicio2;

public class Main {

    public static void main(String[] args) {
        IdadePessoa pessoa1 = new IdadePessoa();
        pessoa1.setNome("Kelvin");
        pessoa1.setIdade(22);

        IdadePessoa pessoa2 = new IdadePessoa();
        pessoa2.setNome("Allana");
        pessoa2.setIdade(22);

        System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos.");
        pessoa1.verificarIdade();

        System.out.println(pessoa2.getNome() + " tem " + pessoa2.getIdade() + " anos.");
        pessoa2.verificarIdade();
    }
}
