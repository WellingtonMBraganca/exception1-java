package application;

import db.DB;
import db.DbException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
    public static void main(String[] args) {
         /*
         TRANSAÇÃO - Operação que deve manter a consistencia do banco de dados.
         Ela deve ter quatro propriedades:
         Atomica - ou acontece tudo, ou nada.
         Consistente - dados devem ter consistencia quando transação inicia e quando tetrmina.
         Isolada - O estado intermediario da transação deve ser isolado, por exemplo, em uma
         operação de tranferencia de valores, um lado precisa saber que saiu e o outro que recebeu,
         os dados intermediarios são desconhecidos para ambas partes.
         Duravel - Após transação, as mudanças devem ser persistentes,
         mesmo em evento de falha de sistema.


         FUNÇÕES:
         SETAUTOCOMMIT(FALSE) - Faz confirmação de cada operação isolada feita,
         se o valor estiver como verdadeiro, caso esteja falso,
         significa que toda operação não esta confirmada, e somente mediante confirmação,
         fecha-se a transação.

         COMMIT() - Confirmar a transação.

         ROLLBACK() - Desfazer o que ja foi feito até o momento, retornando o banco ao estado
         que estava antes do inicio.
         */

        Connection conn = null;
        Statement st = null;
        try {
            conn = DB.getConnection();

            st = conn.createStatement();

            int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");

            //Lançamento de exceção forçada, para teste.
            int x = 1;
            if (x >2){
                throw new SQLException("Fake error...");
            }
            //assim, com esse erro temos a primeira parte do update, nos vendedores do departamneto 1
            //atualizados, ao passo que no departamento 2, não, devido ao erro no meio do caminho.

            int rows2 = st.executeUpdate("UPDATE selles SET BaseSalary = 3090 WHERE DepartmentId = 2");

            System.out.println("Rows1: " + rows1);
            System.out.println("Rows2 : " + rows2);

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }

    }
}
