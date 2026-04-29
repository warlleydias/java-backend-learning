package br.unb.poo.main;

import br.unb.poo.dto.Response;
import br.unb.poo.dto.UsuarioDTO;
import br.unb.poo.exception.SenhaInvalidaException;
import br.unb.poo.service.UsuarioService;

public class Main {

    public static void main(String[] args) {
        
        var service = new UsuarioService();

        try {
            // 1. Chamada do serviço
        	
            var userDTO = service.cadastrarNovoUsuario("Warlley Dias", "wmedeiros.d@gmail.com", "CarolineMarc10");

            // 2. Construção da Resposta de Sucesso
            
            Response<UsuarioDTO> cria = Response.<UsuarioDTO>builder()
                    .sucesso(true)
                    .mensagem("Usuario criado com sucesso!")
                    .dados(userDTO)
                    .build();

            System.out.println(cria);

        } catch (SenhaInvalidaException e) {
            
            // 3. Construção da Resposta de Erro
        	
            Response<Void> erro = Response.<Void>builder()
                    .sucesso(false)
                    .mensagem(e.getMessage())
                    .build();

            System.err.println(erro);
        }
    }
}