package com.equipo.segundo.usuarios.models;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class CRUDDaoEntity implements InterfaceCRUD {

	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public List<Usuario> getMapAll() {
		 return (List<Usuario>) em.createQuery("from Usuario").getResultList();
	}

	@Override
	@Transactional
	public void anadeusu(Usuario usuario) {
		em.merge(usuario);
	}

	@Override
	@Transactional
	public void eliminausu(Usuario usuario) {
		em.remove(usuario);
	}

	@Override
	public Usuario findOne(long id) {
		return em.find(null, id);
	}

	@Override
	public void editausu(long id, Usuario usuario) {
		Usuario currentUsuario = this.findOne(id);
		currentUsuario.setNombre(usuario.getNombre());
		currentUsuario.setApellido(usuario.getApellido());
		currentUsuario.setNick(usuario.getNick());
		currentUsuario.setEmail(usuario.getEmail());
		currentUsuario.setEdad(usuario.getEdad());
		currentUsuario.setBanco(usuario.getBanco());
		currentUsuario.setPelis(usuario.isPelis());
		
	}


}
