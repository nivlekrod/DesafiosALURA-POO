package exercicio5;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro(50.0, 10.0);
        ProdutoFisico produto = new ProdutoFisico(100.0, 15.0);

        System.out.println("Preço final do livro: R$ " + livro.calcularPrecoFinal());
        System.out.println("Preço final do produto físico: R$ " + produto.calcularPrecoFinal());
    }
}
