package com.dovit.demomina.repositories;

import com.dovit.demomina.entities.Mina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MinaRepository extends JpaRepository<Mina, Long> {
}
