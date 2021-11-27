package com.victorlobato.ss.login.config;

import com.victorlobato.ss.login.model.Usuario;
import com.victorlobato.ss.login.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Dados {

    @Autowired
    private UsuarioRepository repository;


    @Bean
    public void insertData(){
        Usuario usuario1 = new Usuario("Victor","$2a$12$Dip4nzsC1uKTMSrCEJPWAePb6SHjoWIFPs/7AE6x9OzglZE7ggr7e","USUARIO");
        Usuario usuario2 = new Usuario("Lobato","$2a$12$AYXDQWcHcYZLrV8S9bdLX.LI5KaLumURUguzpb5j0e6N3l38UcUKa","ADM");

        //usuario1 -> senha : 123
        //usuario2 -> senha : 12345

        repository.saveAll(Arrays.asList(usuario1,usuario2));
    }
}
