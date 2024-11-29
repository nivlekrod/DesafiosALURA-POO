package exercicio1;

public class Main {
    public static void main(String[] args) {
        ModeloCarro meuCarro = new ModeloCarro();
        meuCarro.setModelo("Sedan");
        meuCarro.setMarca("Honda");
        meuCarro.setPrecos(30000, 32000, 35000);
        meuCarro.exibirInfo();
    }
}