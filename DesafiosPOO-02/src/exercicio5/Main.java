package exercicio5;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.setTitulo("Game of Thrones");
        livro1.setAutor("George R. R. Martin");

        Livro livro2 = new Livro();
        livro2.setTitulo("Harry Potter");
        livro2.setAutor("JK Rowling");

        livro1.exibirDetalhes();
        livro2.exibirDetalhes();
    }
}
