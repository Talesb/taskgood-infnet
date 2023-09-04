package br.com.taskgood.taskgood.model;

import br.com.taskgood.taskgood.model.dto.UsuarioDTO;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private Long id;
    private String nome;
    private String email;
    private String token;
    private Endereco endereco;
    private List<Tarefa> tarefas;

    public static Usuario fromDTO(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario();
        usuario.setNome(usuarioDTO.getNome());
        usuario.setEmail(usuarioDTO.getEmail());
        usuario.setToken(usuarioDTO.getToken());
        usuario.setEndereco(new Endereco(usuarioDTO.getCidade(),usuarioDTO.getEstado(),usuarioDTO.getPais()));
        return usuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public void adicionarTarefas(Tarefa tarefa) {
        if(tarefas==null){
            tarefas = new ArrayList<>();
        }

        tarefas.add(tarefa);
    }
}
