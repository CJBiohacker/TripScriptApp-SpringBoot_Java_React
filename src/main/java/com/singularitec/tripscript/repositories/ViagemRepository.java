package com.singularitec.tripscript.repositories;

import com.singularitec.tripscript.models.Viagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViagemRepository extends JpaRepository<Viagem, Integer> {
}
