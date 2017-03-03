public class Program {
    public static void main(String[] args){

        Base serie = new Serie("Game of thrones", 60);
        IExportavel filme = new Filme("Harry Potter", 180);

        filme.exportarEmTxt("D:\\teste.txt");

        System.out.println('A' == 'A');
    }

    //public void registrar

}