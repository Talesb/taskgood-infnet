package br.com.taskgood.taskgood.model;

public interface Dispositivo {
    Long getDispositivoId();

    void validarDispositivoId();

    void sincronizar();
}
