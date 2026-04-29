package br.unb.poo.mapper;

import br.unb.poo.dto.UsuarioDTO;
import br.unb.poo.model.Usuario;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-04-29T08:05:56-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.10 (Eclipse Adoptium)"
)
public class UsuarioMapperImpl implements UsuarioMapper {

    @Override
    public UsuarioDTO toDTO(Usuario user) {
        if ( user == null ) {
            return null;
        }

        UsuarioDTO usuarioDTO = new UsuarioDTO();

        usuarioDTO.setId( user.getId() );
        usuarioDTO.setNome( user.getNome() );
        usuarioDTO.setEmail( user.getEmail() );

        return usuarioDTO;
    }

    @Override
    public Usuario toEntity(UsuarioDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        Usuario usuario = new Usuario();

        return usuario;
    }
}
