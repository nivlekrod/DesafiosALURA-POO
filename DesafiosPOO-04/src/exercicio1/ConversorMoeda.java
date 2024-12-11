package exercicio1;

public class ConversorMoeda implements ConversaoFinanceira {
    @Override
    public void converterDolarParaReal(double valorDolar) {
        double cotacaoDolar = 6.07;
        double valorReal = valorDolar * cotacaoDolar;
        System.out.println("O valor em reais é: R$" + valorReal);
    }
}