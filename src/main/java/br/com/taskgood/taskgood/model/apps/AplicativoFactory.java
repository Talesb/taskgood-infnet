package br.com.taskgood.taskgood.model.apps;

import br.com.taskgood.taskgood.model.Aplicativo;
import br.com.taskgood.taskgood.model.dto.AplicativoDTO;
import br.com.taskgood.taskgood.model.dto.TipoAplicativo;

public class AplicativoFactory {

    public Aplicativo criarAplicativo(AplicativoDTO aplicativoDTO){


        return new GoogleAgenda();
    }


}
