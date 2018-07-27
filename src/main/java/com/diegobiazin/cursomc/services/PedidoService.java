package com.diegobiazin.cursomc.services;

import com.diegobiazin.cursomc.domain.Pedido;
import com.diegobiazin.cursomc.repositories.PedidoRepository;
import com.diegobiazin.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido buscar(Integer id) {
        Optional<Pedido> categoria = pedidoRepository.findById(id);
        return categoria.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
    }
}
