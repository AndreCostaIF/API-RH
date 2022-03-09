package br.com.aula.CRUDCliente.repository;

import br.com.aula.CRUDCliente.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query(value = "SELECT * FROM usuarios WHERE username = ?1", nativeQuery = true)
    Usuario findByUsername (String username);
}
