package com.arcs.menu.menu.server.domain;

import java.io.Serializable;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Produto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long produtoId;
	private String nome;
}
