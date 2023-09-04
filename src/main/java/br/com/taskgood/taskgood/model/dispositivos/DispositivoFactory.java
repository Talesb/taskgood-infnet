package br.com.taskgood.taskgood.model.dispositivos;

import br.com.taskgood.taskgood.model.Dispositivo;
import br.com.taskgood.taskgood.model.dto.DispositivoDTO;

public class DispositivoFactory {

    public static Dispositivo criarDispositivo(DispositivoDTO dto){

        switch (dto.getTipoDispositivo()) {
            case ALEXA -> {
                return new Alexa(dto.getDispositivoId());
            }
            case GOOGLE_HOME -> {
                return new GoogleHome(dto.getDispositivoId());
            }
            default -> {
                throw new RuntimeException("Não foram encontrados dipositivos do tipo informado");
            }
        }

     }

}
