package br.com.taskgood.taskgood.model.apps;

import br.com.taskgood.taskgood.model.Aplicativo;
import br.com.taskgood.taskgood.model.Registravel;

public class GoogleAgenda extends Registravel implements Aplicativo {

    private String codigoPlataforma;

    public void setCodigoPlataforma(String codigoPlataforma) {
        this.codigoPlataforma = "GOO.GL"+codigoPlataforma;
    }

    @Override
    public String getCodigoPlataforma() {
        return codigoPlataforma;
    }

    @Override
    public void validarCodigoPlataforma() {

    }

    @Override
    public void sincronizar() {

    }
}
