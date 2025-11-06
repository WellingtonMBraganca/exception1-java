import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        /*aplicação java nao consegue acessar o kernel, mas consegue fazer chamadas de sistema por
         meio de filewriter e bufferedWritter

        fileWriter: Stream basica de escrita de caracteres em arquivos.

        INSTANCIAÇÃO.
        temos 2 formas diferentes de instanciar sendo elas:
        new FileWriter(path);
        desta forma o arquivo é criado caso não exista, ou recriado caso exista, recriado seria zerar
        o arquivo e começar do inicio.

        new fileWriter(path, true);
        assim temos acrescentar ao arquivo existente, ou seja, escreve-se no final do arquivo.

        */

        String[] lines = new String[]{"lixo", "Fezes", "Bosta"};

        String path = "C:\\Windows\\Temp\\out.txt";

//        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
//            for (String line : lines) {
//                bw.write(line);
//                bw.newLine();
//            }
            //o arquivo foi criado no caminho especificado e escrito a string de lines...
            //entretando, o arquivo sera sobrescrito toda vez com o conteudo de lines...
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
            //neste modelo, o conteudo não é substituido. Apenas se escreve abaixo.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}