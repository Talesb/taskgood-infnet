package br.com.taskgood.taskgood.model.dispositivos;

import br.com.taskgood.taskgood.model.Dispositivo;
import br.com.taskgood.taskgood.model.dto.DispositivoDTO;

public class DispositivoFactory {

    public Dispositivo criarDispositivo(DispositivoDTO dto){



        return new Alexa();
    }

}
