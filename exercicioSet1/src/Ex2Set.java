import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex2Set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();
        int stuA, stuB, stuC;

        System.out.print("How many students from course A: ");
        stuA = sc.nextInt();
        for (int j = 0; j < stuA; j++) {
            System.out.print("aluno: ");
            int aluno = sc.nextInt();
            a.add(aluno);
        }


        System.out.print("How many students from course B: ");
        stuB = sc.nextInt();
        for (int j = 0; j < stuB; j++) {
            System.out.print("aluno: ");
            int aluno = sc.nextInt();
            b.add(aluno);
        }


        System.out.print("How many students from course C: ");
        stuC = sc.nextInt();
        for (int j = 0; j < stuC; j++) {
            System.out.print("aluno: ");
            int aluno = sc.nextInt();
            c.add(aluno);
        }

        Set<Integer> totalStudents = new HashSet<>(a);
        totalStudents.addAll(b);
        totalStudents.addAll(c);

        System.out.println("alunos: " + totalStudents.size());
    }
}
