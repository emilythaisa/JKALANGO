package com.jkalango.webapi;
import org.springframework.web.bind.annotation.RestController;

import com.jkalango.webapi.jogadores.DadosCadastroJogador;
import com.jkalango.webapi.jogadores.JogadorRepository;
import com.jkalango.webapi.jogadores.Jogador;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/jogador")
@RestController
public class JogadorController {
    // o que é injenção de dependencia?
    @Autowired //injeção de Dependecia
    private JogadorRepository repository;

    @PostMapping
    @Transactional //p/habilitar no canco de dados

    public void cadastrar(@RequestBody DadosCadastroJogador dados){
        //System.out.println(dados);
        repository.save(new Jogador(dados));
    }
}
