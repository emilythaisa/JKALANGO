package com.jkalango.webapi.jogadores;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Table(name="jogador")
@Entity(name="Jogador")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode()
public class Jogador {
    @Id @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;
    private String nome; 
    private String nickname; 
    private String email;
    private String telefone; 
    private String senha;

    public Jogador(DadosCadastroJogador dados){
        this.nome = dados.nome();
        this.nickname = dados.nickName();
        this.telefone = dados.telefone();
        this.email = dados.email();
        this.senha = dados.senha();
    }

}
