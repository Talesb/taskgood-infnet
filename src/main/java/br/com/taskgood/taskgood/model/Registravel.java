package br.com.taskgood.taskgood.model;

public class Registravel {

    protected Long id;
    protected String nome;
    protected String urlAPI;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUrlAPI() {
        return urlAPI;
    }

    public void setUrlAPI(String urlAPI) {
        this.urlAPI = urlAPI;
    }
}
