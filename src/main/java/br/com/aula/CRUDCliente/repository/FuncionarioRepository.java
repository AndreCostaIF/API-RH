package br.com.aula.CRUDCliente.repository;

import br.com.aula.CRUDCliente.model.Funcionario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

    @Query(value = "SELECT * FROM cliente WHERE id_usuario = ?1 LIMIT 1", nativeQuery = true)
    public Funcionario login(Long id);

    @Query(value = "SELECT * FROM cliente WHERE LOWER(name) LIKE ?1%", nativeQuery = true)
    public List<Funcionario> searchByName(String name);
}
