package exercicio1;

public class ModeloCarro extends Carro {
    private String marca;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void exibirInfo() {
        System.out.println("Modelo: " + getModelo());
        System.out.println("Marca: " + marca);
        System.out.println("Preço Ano 1: " + getPrecoAno1());
        System.out.println("Preço Ano 2: " + getPrecoAno2());
        System.out.println("Preço Ano 3: " + getPrecoAno3());
        System.out.println("Menor Preço: " + calcularMenorPreco());
        System.out.println("Maior Preço: " + calcularMaiorPreco());
    }
}
