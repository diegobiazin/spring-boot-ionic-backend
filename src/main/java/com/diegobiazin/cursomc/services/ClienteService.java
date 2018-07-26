package com.diegobiazin.cursomc.services;

import com.diegobiazin.cursomc.domain.Cliente;
import com.diegobiazin.cursomc.repositories.ClienteRepository;
import com.diegobiazin.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente buscar(Integer id) {
        Optional<Cliente> categoria = clienteRepository.findById(id);
        return categoria.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
    }
}
