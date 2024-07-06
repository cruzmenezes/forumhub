package com.forumhub.api.controller;

import com.forumhub.api.model.Topico;
import com.forumhub.api.service.TopicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoService topicoService;

    @PostMapping
    public Topico criarTopico(@RequestBody Topico topico) {
        return topicoService.criarTopicos(topico);
    }

    @GetMapping
    public List<Topico> listarTopicos() {
        return topicoService.listarTopicos();
    }
}
