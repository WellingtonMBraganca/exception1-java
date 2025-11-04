import java.io.File;

public class CaminhoDOArquivo {
    public static void main(String[] args) {


        File path = new File("C:\\Windows\\Temp");

        System.out.println("getName: " + path.getName());
        System.out.println("getParent " + path.getParent());
        System.out.println("getPath " + path.getPath());
    }
}
