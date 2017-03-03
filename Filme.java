import java.util.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.io.IOException;

public class Filme extends Base implements IExportavel {
    private int qtdTotalMinutos;
    private int qtdMinutosAssistido;

    public int getQtdTotalMinutos() {
        return this.qtdTotalMinutos;
    }

    public void setQtdTotalMinutos(int qtdTotalMinutos) {
        this.qtdTotalMinutos = qtdTotalMinutos;
    }

    public int getQtdMinutosAssistido() {
        return this.qtdMinutosAssistido;
    }

    public void setQtdMinutosAssistido(int qtdMinutosAssistido) {
        this.qtdMinutosAssistido = qtdMinutosAssistido;
    }

     public Filme(String titulo, int qtdTotalMinutos){
        super(titulo);
        this.qtdTotalMinutos = qtdTotalMinutos;
    }

    // Especificar quantos minutos ao TOTAL foram assistidos. Isso vai ALTERAR o tempo assistido para o valor atual.
    public void registrarQtdAssistido(int qtdAssistido){
        if(this.qtdTotalMinutos < qtdAssistido){
            System.out.println("Impossível registrar tempo maior do que o total de minutos do filme");
            return;
        }

        this.qtdMinutosAssistido = qtdAssistido;
    }

    public void exportarEmTxt(String caminhoArquivo){
        String strBuilder = "Título do filme: " + getTitulo() + "\r\n";
        strBuilder += "Assistido: ";

        if(qtdMinutosAssistido == 0){
            strBuilder += "Você ainda não começou a assistir este filme";
        }else{
            strBuilder += qtdMinutosAssistido + " minutos";
        }

        List<String> linhas = Arrays.asList(strBuilder.split("\n"));
        Path file = Paths.get(caminhoArquivo);

        try {
            Files.write(file, linhas, Charset.forName("UTF-8"));
        }catch(IOException ioEx){
            System.out.println("Ocorreu um erro ao salvar o arquivo.");
        }
    }
}