package br.unb.poo.service;

import br.unb.poo.dto.UsuarioDTO;
import br.unb.poo.mapper.UsuarioMapper;
import br.unb.poo.exception.SenhaInvalidaException;
import br.unb.poo.model.Usuario;
import java.util.concurrent.ThreadLocalRandom;

public class UsuarioService {

	private UsuarioMapper mapper = UsuarioMapper.INSTANCE;
	
	public UsuarioDTO cadastrarNovoUsuario(String nome, String email, String senha) {
		
		if(senha == null || senha.length() < 6) {
			throw new SenhaInvalidaException("Senha curta demais!");
		}
		
		long novoId = ThreadLocalRandom.current().nextLong(1, 10000);
		
		Usuario novoUser = new Usuario(nome, email, senha, novoId);
		
		UsuarioDTO dto = mapper.toDTO(novoUser);	
		
		return dto;
		
	}
}
