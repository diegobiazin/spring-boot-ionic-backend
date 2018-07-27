package com.diegobiazin.cursomc.resources;

import com.diegobiazin.cursomc.domain.Pedido;
import com.diegobiazin.cursomc.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "pedidos")
public class PedidoResource {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping(path = "/{id}")
    public ResponseEntity<?> find(@PathVariable Integer id) {
        Pedido obj = pedidoService.buscar(id);
        return ResponseEntity.ok(obj);
    }
}
