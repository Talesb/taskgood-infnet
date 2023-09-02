package br.com.taskgood.taskgood.model;

public interface Aplicativo {
    String getCodigoPlataforma();
    void validarCodigoPlataforma();
    void sincronizar();
}
