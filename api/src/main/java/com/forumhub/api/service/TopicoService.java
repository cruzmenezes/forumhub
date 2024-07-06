package com.forumhub.api.service;

import com.forumhub.api.model.Topico;
import com.forumhub.api.model.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicoService {

    @Autowired
    private TopicoRepository topicoRepository;

    public void criarTopico(Topico topico) {
    }

    public List<Topico> listarTopicos() {
    }

    public Topico criarTopicos(Topico topico) {
    }
}
