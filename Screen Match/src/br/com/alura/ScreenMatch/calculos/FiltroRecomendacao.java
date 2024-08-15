package br.com.alura.ScreenMatch.calculos;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificalvel classificalvel) {
        if (classificalvel.getClassificacao() >=4) {
            System.out.println("Está entre os preferidos do momento");
        } else if (classificalvel.getClassificacao() >=2) {
            System.out.println("Muito bem avaliado no momento!");
        } else {
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}
