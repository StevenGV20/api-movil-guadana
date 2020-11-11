package com.redsocial.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redsocial.entity.Autor;
import com.redsocial.repository.AutorRepository;

@Service
public class AutorServiceImpl implements AutorService {
	
	@Autowired
	private AutorRepository repository;
	
	@Override
	public List<Autor> listaAutor() {
		return repository.findAll();
	}

	@Override
	public Autor insertActualizaAutor(Autor obj) {
		return repository.save(obj);
	}

	@Override
	public void eliminaAutor(int id) {
		repository.deleteById(id);
	}

	@Override
	public Optional<Autor> buscaAutor(int id) {
		return repository.findById(id);
	}

}
