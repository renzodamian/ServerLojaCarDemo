package com.rdjaramillo.core.Security.Repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rdjaramillo.core.Entity.Usuario;


@Repository
public interface UserRepository extends CrudRepository<Usuario, Long>  {
    public Optional<Usuario> findByUsername(String username);
}