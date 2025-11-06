import entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file full path: ");
        String path = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            Set<LogEntry> log = new HashSet<>();

            String line = br.readLine();
            while(line != null){
                String[] fields = line.split(" ");
                String userName = fields[0];
                Date momento = Date.from(Instant.parse(fields[1]));

                log.add(new LogEntry(userName, momento));
                line = br.readLine();
            }
            System.out.println("Total users: " + log.size());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}