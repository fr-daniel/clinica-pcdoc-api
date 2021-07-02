package br.com.pcdoc.clinicapcdocapi.model;

import javax.persistence.Embeddable;

@Embeddable
public class TipoAtendimento {
    private Integer prioridade;
    private String descricao;
    private String classificacao;

    public Integer getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Integer prioridade) {
        this.prioridade = prioridade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
}
