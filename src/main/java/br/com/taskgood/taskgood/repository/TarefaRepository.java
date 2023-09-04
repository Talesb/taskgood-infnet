package br.com.taskgood.taskgood.repository;

import br.com.taskgood.taskgood.model.Tarefa;
import br.com.taskgood.taskgood.model.Usuario;

import java.util.List;
import java.util.stream.Collectors;

public class TarefaRepository {
    public Tarefa salvar(Tarefa tarefa) {
        Long index = TarefaMockDB.getInstance().getIndex();
        TarefaMockDB.getInstance().getDataBase().put(index, tarefa);
        tarefa.setId(index);
        UsuarioMockDB.getInstance().setIndex(index + 1);
        return tarefa;
    }


    public Tarefa obterPorId(Long id) {
        return TarefaMockDB.getInstance().getDataBase().get(id);
    }

    public void deletarPorId(Long id) {
        TarefaMockDB.getInstance().getDataBase().remove(id);
    }


    public List<Tarefa> obterTodasPorUsuario(Long usuarioId) {
        return TarefaMockDB.getInstance().getDataBase().values().stream().filter(tarefa ->
                tarefa.getUsuarioId().longValue() == usuarioId.longValue()).collect(Collectors.toList());

    }

}
