package br.com.taskgood.taskgood.service;

import br.com.taskgood.taskgood.model.Usuario;
import br.com.taskgood.taskgood.model.dto.UsuarioDTO;
import br.com.taskgood.taskgood.repository.UsuarioMockDB;
import br.com.taskgood.taskgood.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private UsuarioRepository usuarioRepository;

    private TarefaService tarefaService;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario criarUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = Usuario.fromDTO(usuarioDTO);
        return this.usuarioRepository.salvar(usuario);
    }

    public Usuario obterUsuario(Long id) {
        return this.usuarioRepository.obterPorId(id);
    }

    public void deletarUsuario(Long id) {
        this.usuarioRepository.deletarPorId(id);
    }


    public void atualizarUsuario(Usuario usuario) {
        if (usuario.getId() != null) {
            this.deletarUsuario(usuario.getId());
            UsuarioMockDB.getInstance().getDataBase().put(usuario.getId(), usuario);
        }
    }
}
