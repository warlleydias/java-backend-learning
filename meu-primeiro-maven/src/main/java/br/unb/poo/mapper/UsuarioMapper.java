package br.unb.poo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import br.unb.poo.dto.UsuarioDTO;
import br.unb.poo.model.Usuario;

@Mapper

public interface UsuarioMapper {

	UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);
	
	UsuarioDTO toDTO (Usuario user);
	
	Usuario toEntity(UsuarioDTO userDTO);
}
