package br.com.taskgood.taskgood.service;

import br.com.taskgood.taskgood.model.Tarefa;
import br.com.taskgood.taskgood.model.Usuario;
import br.com.taskgood.taskgood.model.dto.TarefaDTO;
import br.com.taskgood.taskgood.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;

    @Autowired
    UsuarioService usuarioService;

    public TarefaService(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    public void adicionarTarefa(TarefaDTO tarefa) {
        this.criarTarefa(tarefa);
    }

    public Tarefa criarTarefa(TarefaDTO dto) {
        Tarefa tarefa = new Tarefa(dto);
        this.tarefaRepository.salvar(tarefa);
        Usuario usuario = this.usuarioService.obterUsuario(dto.getUsuarioId());
        usuario.adicionarTarefas(tarefa);
        this.usuarioService.atualizarUsuario(usuario);
        return tarefa;
    }

    public Tarefa obterPorId(Long id) {
        return this.tarefaRepository.obterPorId(id);
    }


    public void sincronizarDispositivosTarefa(Tarefa tarefa) {
        tarefa.getDispositivosAssociados().forEach(dispositivo -> {
            dispositivo.validarDispositivoId();
            dispositivo.sincronizar();
        });

    }

    public void sincronizarAplicativosTarefa(Tarefa tarefa) {
        tarefa.getAplicativosAssociados().forEach(aplicativo -> {
            aplicativo.validarCodigoPlataforma();
            aplicativo.sincronizar();
        });
    }


    public List<Tarefa> obterTodasTarefasPorUsuario(Long usuarioId) {
        return this.tarefaRepository.obterTodasPorUsuario(usuarioId);
    }


}
