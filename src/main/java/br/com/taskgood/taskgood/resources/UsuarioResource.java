package br.com.taskgood.taskgood.resources;

import br.com.taskgood.taskgood.model.Usuario;
import br.com.taskgood.taskgood.model.dto.UsuarioDTO;
import br.com.taskgood.taskgood.service.TarefaService;
import br.com.taskgood.taskgood.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioResource {

    @Autowired
    UsuarioService usuarioService;


    @GetMapping("/{id}")
    public Usuario obterPorId(@PathVariable Long id) {
        return usuarioService.obterUsuario(id);
    }

    @PostMapping
    public Usuario criarUsuario(@RequestBody UsuarioDTO usuario) {
        return this.usuarioService.criarUsuario(usuario);
    }

    @DeleteMapping("/{id}")
    public void  deletarPorId(@PathVariable Long id) {
          usuarioService.deletarUsuario(id);
    }




}
