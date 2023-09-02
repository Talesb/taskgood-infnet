package br.com.taskgood.taskgood.repository;

import br.com.taskgood.taskgood.model.Usuario;

public class UsuarioRepository {

    public Usuario salvar(Usuario usuario) {
        Long index = UsuarioMockDB.getInstance().getIndex();
        UsuarioMockDB.getInstance().getDataBase().put(index, usuario);
        UsuarioMockDB.getInstance().setIndex(index+1);
        return usuario;
    }

    public Usuario obterPorId(Long id) {
        return UsuarioMockDB.getInstance().getDataBase().get(id);
    }

    public void deletarPorId(Long id) {
        UsuarioMockDB.getInstance().getDataBase().remove(id);
    }
}
