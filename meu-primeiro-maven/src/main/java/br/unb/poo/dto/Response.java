package br.unb.poo.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Builder

public class Response<T> {
	private String mensagem;
	private T dados;
	private boolean sucesso;
}
