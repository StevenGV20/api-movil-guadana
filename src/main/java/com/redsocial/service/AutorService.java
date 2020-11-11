package com.redsocial.service;

import java.util.List;
import java.util.Optional;

import com.redsocial.entity.Autor;


public interface AutorService {
	
	public abstract List<Autor> listaAutor();
	public abstract Autor insertActualizaAutor(Autor obj);
	public abstract void eliminaAutor(int id);
	public abstract Optional<Autor> buscaAutor(int id); 
}
