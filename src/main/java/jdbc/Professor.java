package jdbc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Professor {
    private Integer id;
    private String nome;
    private Date dataNascimento;
    private Integer cargaHoraria;
    private Double valorHora;
    private boolean estrangeiro;
    private Integer horasDisponiveis;
    private String biografia;
    private Date dataHoraCadastro;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                try{
                    this.dataNascimento = sdf.parse(dataNascimento);
                } catch (ParseException e){
                    e.printStackTrace();
                }
    }


    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setDataHoraCadastro(Date dataHoraCadastro) {
        this.dataHoraCadastro = dataHoraCadastro;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public boolean isEstrangeiro() {
        return estrangeiro;
    }

    public void setEstrangeiro(boolean estrangeiro) {
        this.estrangeiro = estrangeiro;
    }

    public Integer getHorasDisponiveis() {
        return horasDisponiveis;
    }

    public void setHorasDisponiveis(Integer horasDisponiveis) {
        this.horasDisponiveis = horasDisponiveis;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public Date getDataHoraCadastro() {
        return dataHoraCadastro;
    }

    public void setDataHoraCadastro(String dataHoraCadastro) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            this.dataHoraCadastro = sdf.parse(dataHoraCadastro);
        } catch (ParseException e){
            e.printStackTrace();
        }
    }
}
