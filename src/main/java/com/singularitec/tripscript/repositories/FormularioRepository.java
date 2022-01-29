package com.singularitec.tripscript.repositories;

import com.singularitec.tripscript.models.Formulario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormularioRepository extends JpaRepository<Formulario, Integer> {
}
