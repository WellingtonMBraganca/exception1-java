import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class tryWithResources {
    public static void main(String[] args) {
        //bloco try que declara um ou mais recursos e
        //garante qyue esses recursos serão fechados ao final do bloco.

        String path = "C:\\Windows\\Temp\\in.txt";
        //declaração do contrutor ja no argumento do try
        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();

            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException ioe) {
            throw new RuntimeException(ioe.getMessage());
        }
    }
}
