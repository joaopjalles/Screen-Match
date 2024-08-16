package br.com.alura.ScreenMatch.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private boolean ativa;
    private int episofiosPorTemporada;
    private int minutosPorEpisodio;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisofiosPorTemporada() {
        return episofiosPorTemporada;
    }

    public void setEpisofiosPorTemporada(int episofiosPorTemporada) {
        this.episofiosPorTemporada = episofiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episofiosPorTemporada * minutosPorEpisodio  ;
    }

    public String toString() {
        return "Série: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }
}

