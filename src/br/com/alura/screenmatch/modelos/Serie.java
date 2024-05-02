package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{
    private int temporadas;
    private boolean ativa;
    private int epidodiosPorTemporada;
    private int minutosPorTemporadas;

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

    public int getEpidodiosPorTemporada() {
        return epidodiosPorTemporada;
    }

    public void setEpidodiosPorTemporada(int epidodiosPorTemporada) {
        this.epidodiosPorTemporada = epidodiosPorTemporada;
    }

    public int getMinutosPorTemporadas() {
        return minutosPorTemporadas;
    }

    public void setMinutosPorTemporadas(int minutosPorTemporadas) {
        this.minutosPorTemporadas = minutosPorTemporadas;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * epidodiosPorTemporada * minutosPorTemporadas;
    }
}
