package com.unab.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.unab.app.models.Usuario;

@Repository
public interface IUsuarioDAO extends CrudRepository<Usuario, Long>{
	public Usuario findByUsername(String username);
<<<<<<< HEAD
}
=======
}
>>>>>>> 564036f9ecb251729d33cc564710cd95c35beabf
