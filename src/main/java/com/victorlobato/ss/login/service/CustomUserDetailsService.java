package com.victorlobato.ss.login.service;

import com.victorlobato.ss.login.config.CustomUserDetails;
import com.victorlobato.ss.login.model.Usuario;
import com.victorlobato.ss.login.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    UsuarioRepository repository;

    @Override
    public UserDetails loadUserByUsername(String nome) throws UsernameNotFoundException {
        Usuario usuario = repository.findByUsuario(nome);
        if(usuario == null){
            throw new UsernameNotFoundException(
                    "Usuario com o nome "+ usuario.getUsuario() + " não foi encontrado");
        }

        return new CustomUserDetails(usuario);
    }
}
