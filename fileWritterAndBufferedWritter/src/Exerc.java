import java.io.*;

public class Exerc {
    public static void main(String[] args) {
        File path1 = new File("C:\\Users\\braga\\OneDrive\\Documentos\\lixo\\lixo.csv");
        File path2 = new File("C:\\Users\\braga\\OneDrive\\Documentos\\lixo\\summary.csv");

        try (BufferedReader br = new BufferedReader(new FileReader(path1))) {

            String line = br.readLine();
            while (line != null) {
                String[] dados = line.split(",");
                double price = Double.parseDouble(dados[1]);
                int quantity = Integer.parseInt(dados[2]);

                double valorTotal = price * quantity;
                String product = (dados[0] + ", " + String.format("%.2f", valorTotal));

                try (BufferedWriter bw = new BufferedWriter(new FileWriter(path2, true))) {

                    bw.write(product);
                    bw.newLine();
                }
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
