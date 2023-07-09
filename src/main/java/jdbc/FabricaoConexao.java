package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class FabricaoConexao {
    private static Connection connection;
    public static void iniciarConexao(){
        /**
         isso só deve acontecer uma vez ao longo da aplicação
         Se algum dia precisar, estude sobre padrão singleton
         */
        try{
            //simulando aspecto de singleton
            if(connection==null) {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/teste", "root", "4082003Ro@");
                System.out.println("CONEXAO REALIZADA COM SUCESSO");
            }
        }catch (Exception ex){
            ex.printStackTrace();
            throw new RuntimeException("Erro ao tentar realizar uma conexão");
        }
    }
    public static Connection getConnection(){

        return connection;
    }
}
