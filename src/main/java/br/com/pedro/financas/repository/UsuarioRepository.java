package br.com.pedro.financas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pedro.financas.model.Usuario;

public interface UsuarioRepository extends JpaRepository<UsuarioRepository, Long>{

	boolean existsByEmail(String email);

	void save(Usuario usuario);

}
