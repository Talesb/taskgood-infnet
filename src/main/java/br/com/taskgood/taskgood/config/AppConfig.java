package br.com.taskgood.taskgood.config;


import br.com.taskgood.taskgood.repository.TarefaRepository;
import br.com.taskgood.taskgood.repository.UsuarioRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public UsuarioRepository usuarioRepository() {
        return new UsuarioRepository();
    }

    @Bean
    public TarefaRepository tarefaRepository() {
        return new TarefaRepository();
    }

}
