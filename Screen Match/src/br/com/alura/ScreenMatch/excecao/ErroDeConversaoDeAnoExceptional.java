package br.com.alura.ScreenMatch.excecao;

public class ErroDeConversaoDeAnoExceptional extends RuntimeException {
    private String mensagem;
    public ErroDeConversaoDeAnoExceptional(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
