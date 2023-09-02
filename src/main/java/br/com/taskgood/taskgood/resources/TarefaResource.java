package br.com.taskgood.taskgood.resources;

import br.com.taskgood.taskgood.model.Tarefa;
import br.com.taskgood.taskgood.model.Usuario;
import br.com.taskgood.taskgood.model.dto.TarefaDTO;
import br.com.taskgood.taskgood.model.dto.UsuarioDTO;
import br.com.taskgood.taskgood.service.TarefaService;
import br.com.taskgood.taskgood.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/tarefa")
public class TarefaResource {

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    TarefaService tarefaService;

    @GetMapping()
    public List<Tarefa> obterPorUsuarioId(@RequestParam(name = "usuarioid") String usuarioId) {
        Usuario usuario = this.usuarioService.obterUsuario(Long.parseLong(usuarioId));
        return tarefaService.obterTodasTarefasPorUsuario(usuario);
    }

    public void adicionarTarefa(@RequestBody TarefaDTO tarefa){
        this.tarefaService.adicionarTarefa(tarefa);

    }


}
