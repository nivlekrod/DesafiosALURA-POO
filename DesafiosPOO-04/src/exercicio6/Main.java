package exercicio6;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 2500.0);
        Servico servico = new Servico("Manutenção de computadores", 150.0);

        System.out.println("Preço total do produto (3 unidades): R$ " + produto.calcularPrecoTotal(3));
        produto.aplicarDesconto(10);
        System.out.println("Preço do produto com desconto: R$ " + produto.getPrecoUnitario());

        System.out.println("Preço total do serviço (4 horas): R$ " + servico.calcularPrecoTotal(4));
        servico.aplicarDesconto(15);
        System.out.println("Preço do serviço com desconto por hora: R$ " + servico.getPrecoHora());
    }
}
