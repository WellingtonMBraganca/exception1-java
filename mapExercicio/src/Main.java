import entities.Candidates;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String path = "C:\\Windows\\Temp\\in.txt";
        Map<String, Integer> candidatos = new HashMap<>();




        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while(line != null){
                String[] fields = line.split(",");
                String name = fields[0];
                Integer votes = Integer.parseInt(fields[1]);

                int intermediario;
                if(candidatos.containsKey(name)){
                    votes += candidatos.get(name);
                }

                candidatos.put(name, votes);
                line = br.readLine();
            }

            for (String key: candidatos.keySet()){
                System.out.println(key + ": " + candidatos.get(key) + " votes.");
            }
        }catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}