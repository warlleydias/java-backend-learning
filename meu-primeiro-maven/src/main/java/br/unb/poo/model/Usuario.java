package br.unb.poo.model;

import br.unb.poo.exception.SenhaInvalidaException;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Usuario {

	private String nome;
	private String email;
	private String senha;
	private Long id;
	
	public void atualizarSenha(String antigaSenha, String novaSenha) {
		if(!this.senha.equals(antigaSenha)){
			throw new SenhaInvalidaException("Senha informada está incorreta!");
		}
		this.senha = novaSenha;
	}
}
