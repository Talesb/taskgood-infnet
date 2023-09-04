package br.com.taskgood.taskgood.model.apps;

import br.com.taskgood.taskgood.model.Aplicativo;
import br.com.taskgood.taskgood.model.dto.AplicativoDTO;
import br.com.taskgood.taskgood.model.dto.TipoAplicativo;

public class AplicativoFactory {

    public static Aplicativo criarAplicativo(AplicativoDTO aplicativoDTO) {

        switch (aplicativoDTO.getTipoAplicativo()) {
            case GOOGLE_AGENDA -> {
                return new GoogleAgenda(aplicativoDTO.getCodigoPlataforma());
            }
            case TEAMS -> {
                return new TeamsAgenda(aplicativoDTO.getCodigoPlataforma());
            }
            default -> {
                throw new RuntimeException("Não foram encontrados dipositivos do tipo informado");
            }
        }


    }
}