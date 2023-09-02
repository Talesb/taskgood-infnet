package br.com.taskgood.taskgood.model.dto;

public class AplicativoDTO {

    private String codigoPlataforma;

    private TipoAplicativo tipoAplicativo;

    public String getCodigoPlataforma() {
        return codigoPlataforma;
    }

    public void setCodigoPlataforma(String codigoPlataforma) {
        this.codigoPlataforma = codigoPlataforma;
    }

    public TipoAplicativo getTipoAplicativo() {
        return tipoAplicativo;
    }

    public void setTipoAplicativo(TipoAplicativo tipoAplicativo) {
        this.tipoAplicativo = tipoAplicativo;
    }
}
