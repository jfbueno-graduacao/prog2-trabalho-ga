public class Serie extends Base {
    private int qtdTotalEpisodios;
    private int qtdEpisodiosAssistidos;

    public int getQtdTotalEpisodios() {
        return this.qtdTotalEpisodios;
    }

    public void setQtdTotalEpisodios(int qtdTotalEpisodios) {
        this.qtdTotalEpisodios = qtdTotalEpisodios;
    }

    public int getQtdEpisodiosAssistidos() {
        return this.qtdEpisodiosAssistidos;
    }

    public void setQtdEpisodiosAssistidos(int qtdEpisodiosAssistidos) {
        this.qtdEpisodiosAssistidos = qtdEpisodiosAssistidos;
    }

    public Serie(String titulo, int qtdEpisodios){
        super(titulo);
        this.qtdTotalEpisodios = qtdEpisodios;
    }

    // Especificar quantos espisódios foram assistidos desta vez. Isso será concatenado com o valor existente
    public void registrarQtdAssistido(int qtdAssistido){
        if(this.qtdEpisodiosAssistidos < qtdAssistido){
            System.out.println("Impossível registrar quantidade de episódios maior do que o total da série");
            return;
        }

        this.qtdEpisodiosAssistidos += qtdAssistido;
    }
}