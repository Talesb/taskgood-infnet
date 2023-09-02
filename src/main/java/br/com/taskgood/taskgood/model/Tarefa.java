package br.com.taskgood.taskgood.model;

import java.util.List;

public class Tarefa {
    private Long id;
    private String titulo;
    private String conteudo;
    private Long duracaoEmMinutos;
    private Long usuarioId;
    private List<Dispositivo> dispositivosAssociados;
    private List<Aplicativo> aplicativosAssociados;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Long getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(Long duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public List<Dispositivo> getDispositivosAssociados() {
        return dispositivosAssociados;
    }

    public void setDispositivosAssociados(List<Dispositivo> dispositivosAssociados) {
        this.dispositivosAssociados = dispositivosAssociados;
    }

    public List<Aplicativo> getAplicativosAssociados() {
        return aplicativosAssociados;
    }

    public void setAplicativosAssociados(List<Aplicativo> aplicativosAssociados) {
        this.aplicativosAssociados = aplicativosAssociados;
    }
    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }
}
