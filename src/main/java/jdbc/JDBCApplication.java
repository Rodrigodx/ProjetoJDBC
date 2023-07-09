package jdbc;

import java.util.Date;
import java.util.List;

public class JDBCApplication {
    private static ProfessorCrud professorCrud;
    public static void main(String[] args) {
        FabricaoConexao.iniciarConexao();
        professorCrud = new ProfessorCrud();
        //incluirProfessor();
        //alterarProfessor();
        //listarProfessores();
        mostrarProfessor();
        //excluirProfessor();
    }
    //pensem que estes métodos poderiam ações de seu sistema
    private static void incluirProfessor(){
        Professor professor  =new Professor();
        professor.setNome("Rodrigo");
        professor.setDataNascimento("2003-08-04");
        professor.setCargaHoraria(60);
        professor.setValorHora(8.0);
        professor.setEstrangeiro(true);
        professor.setHorasDisponiveis(10);
        professor.setBiografia("Apaixonando por tecnologia");
        professor.setDataHoraCadastro(new Date());

        professorCrud.save(professor);
    }
    private static void alterarProfessor(){
        Professor professor  = professorCrud.findById(1);
        if(professor!=null){
            professor.setNome("Rodddd");
            professor.setDataNascimento("2003-08-05");
            professor.setCargaHoraria(40);
            professor.setValorHora(8.0);
            professor.setEstrangeiro(true);
            professor.setHorasDisponiveis(10);
            professor.setBiografia("Apaixonando por tecnologia");
            professor.setDataHoraCadastro(new Date());
            professorCrud.update(professor);
        }else {
            System.out.println("Não existe a professor com o id informado");
        }
    }
    private static void listarProfessores(){
        List<Professor> professores = professorCrud.findAll();
        for(Professor p:professores){
            System.out.println(p.getId() + "--" + p.getNome());
        }
    }

    private static void mostrarProfessor(){
        Professor professor = professorCrud.findById(1);
        System.out.println(professor.getId() + "--" + professor.getNome());
    }
    private static void excluirProfessor(){
        int linhasDeletas = professorCrud.delete(2);
        if(linhasDeletas==0)
            System.out.println("Nenhum registro com id informado localizado para a exclusão");
    }
}
