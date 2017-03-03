public abstract class Base {
    private String titulo;
    private char status;

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public char getStatus() {
        return this.status;
    }

    public void setStatus(char status) {
        if(status != 'A' || status != 'P' || status != 'C')
            status = 'P';

        this.status = status;
    }

    public Base(String titulo){
        this.titulo = titulo;
        setStatus('P');
    }

    public String traduzStatus(){
        switch(this.status){
            case 'A':
                return "Assistindo";
            case 'P':
                return "Pendente";
            case 'C':
                return "Concluído";
            default:
                return "Impossível traduzir status " + this.status;
        }
    }

    public abstract void registrarQtdAssistido(int qtd);
}