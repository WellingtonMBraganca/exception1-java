import java.io.IOException;
import java.util.Scanner;

public class File {
    public static void main(String[] args) {
        java.io.File file = new java.io.File("C:\\Windows\\Temp\\in.txt");

        System.out.println(file);
        Scanner sc = null;
        try{
        sc = new Scanner(file);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        }
        catch(IOException ioe){
            System.out.println("Error: " + ioe.getMessage());
        }finally{
            if(sc != null){
                sc.close();
            }
        }


    }
}