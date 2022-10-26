package com.lucasit.repository;

import com.lucasit.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Pessoa, Long> {
}
