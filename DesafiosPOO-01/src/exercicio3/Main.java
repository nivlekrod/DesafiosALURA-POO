package exercicio3;

public class Main {

    public static void main(String[] args) {
        Musica minhaMusica = new Musica();

        minhaMusica.titulo = "The Emptiness Machine";
        minhaMusica.artista = "Linkin Park";
        minhaMusica.anoLancamento = 2024;

        minhaMusica.exibeFichaTecnica();

        minhaMusica.avalia(8.5);
        minhaMusica.avalia(6.8);
        minhaMusica.avalia(10.0);

        double mediaAvaliacoes = minhaMusica.pegaMedia();
        System.out.println("Média das avaliações: " + mediaAvaliacoes);
    }
}
