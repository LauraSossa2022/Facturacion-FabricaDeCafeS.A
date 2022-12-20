package com.unab.app.interfaces;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import com.unab.app.models.Cliente;

public interface IClienteService {
	public List<Cliente> findAll();

	public Page<Cliente> findAll(Pageable pageable);

	public void save(Cliente cliente);

	public Cliente findOne(Long id);

	public ResponseEntity<String> delete(Long id);
<<<<<<< HEAD
}

=======
}
>>>>>>> 564036f9ecb251729d33cc564710cd95c35beabf
