import java.io.File;
import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String scPath = sc.nextLine();

        File path = new File(scPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");
        for (File folder: folders){
            System.out.println(folder);
        }



    }
}
