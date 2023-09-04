package br.com.taskgood.taskgood.model.dispositivos;

import br.com.taskgood.taskgood.model.Dispositivo;
import br.com.taskgood.taskgood.model.Registravel;

public class Alexa extends Registravel implements Dispositivo {

    public Alexa(Long dispositivoId) {
        this.dispositivoId = dispositivoId;
    }

    private Long dispositivoId;

    public void setDispositivoId(Long dispositivoId) {
        this.dispositivoId = dispositivoId;
    }

    @Override
    public Long getDispositivoId() {
        return dispositivoId;
    }

    @Override
    public void validarDispositivoId() {

    }

    @Override
    public void sincronizar() {

    }
}
