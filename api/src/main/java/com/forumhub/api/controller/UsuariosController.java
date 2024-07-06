package com.forumhub.api.controller;


import com.forumhub.api.usuario.DadosCadastroUsuario;
import com.forumhub.api.usuario.Usuario;
import com.forumhub.api.usuario.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuarios")
public class UsuariosController {

    @Autowired
    private UsuarioRepository repository;


    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroUsuario dados){
        repository.save(new Usuario (dados));

    }
}
