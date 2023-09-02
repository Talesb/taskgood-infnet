package br.com.taskgood.taskgood.model.dispositivos;

import br.com.taskgood.taskgood.model.Dispositivo;
import br.com.taskgood.taskgood.model.Registravel;

public class Alexa extends Registravel implements Dispositivo {

    private Long dispositivoId;

    public void setDispositivoId(Long dispositivoId) {
        this.dispositivoId = dispositivoId;
    }

    @Override
    public Long getDispositivoId() {
        return null;
    }

    @Override
    public void validarDispositivoId() {

    }

    @Override
    public void sincronizar() {

    }
}
