package com.singularitec.tripscript.services;

import com.singularitec.tripscript.models.Viagem;

import java.util.List;

public interface ViagemService {
    Viagem saveViagem(Viagem viagem);
    List<Viagem> getAllViagens();
}
