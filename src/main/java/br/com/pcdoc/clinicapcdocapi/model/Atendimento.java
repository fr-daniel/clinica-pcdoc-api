package br.com.pcdoc.clinicapcdocapi.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "atendimento")
public class Atendimento implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    private String nome;

    @Embedded
    private TipoAtendimento tipoAtendimento;

    @Column(name = "data_atendimento")
    private LocalDateTime dataAtendimento;

    public Atendimento() {
    }

    public Atendimento(long codigo, String nome, TipoAtendimento tipoAtendimento, LocalDateTime dataAtendimento) {
        this.codigo = codigo;
        this.nome = nome;
        this.tipoAtendimento = tipoAtendimento;
        this.dataAtendimento = dataAtendimento;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoAtendimento getTipoAtendimento() {
        return tipoAtendimento;
    }

    public void setTipoAtendimento(TipoAtendimento tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }

    public LocalDateTime getDataAtendimento() {
        return dataAtendimento;
    }

    public void setDataAtendimento(LocalDateTime dataAtendimento) {
        this.dataAtendimento = dataAtendimento;
    }
    
}
