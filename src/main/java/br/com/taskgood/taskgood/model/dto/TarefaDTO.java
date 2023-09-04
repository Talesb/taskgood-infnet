package br.com.taskgood.taskgood.model.dto;

import br.com.taskgood.taskgood.model.Dispositivo;

import java.util.List;

public class TarefaDTO {

    private String titulo;
    private String conteudo;
    private Long duracaoEmMinutos;
    private Long usuarioId;
    private List<DispositivoDTO> dispositivos;
    private List<AplicativoDTO> aplicativos;


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

    public List<DispositivoDTO> getDispositivos() {
        return dispositivos;
    }

    public void setDispositivos(List<DispositivoDTO> dispositivos) {
        this.dispositivos = dispositivos;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }


    public List<AplicativoDTO> getAplicativos() {
        return aplicativos;
    }

    public void setAplicativos(List<AplicativoDTO> aplicativos) {
        this.aplicativos = aplicativos;
    }
}
