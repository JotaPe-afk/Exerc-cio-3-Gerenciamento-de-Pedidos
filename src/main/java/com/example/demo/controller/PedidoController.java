package com.example.demo.controller;

import com.example.demo.entity.models.PedidoModel;
import com.example.demo.repository.PedidoRepository;
import com.example.demo.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public PedidoModel criarPedido(@RequestBody PedidoModel pedidoModel) {
        return pedidoService.criarPedido(pedidoModel);
    }

    @GetMapping
    public List<PedidoModel> listarPedidos(){
        return pedidoService.listarPedidos();
    }

    @GetMapping("/{id}")
    public PedidoModel buscarPedido(@PathVariable Long id){
        return pedidoService.buscarPedido(id);
    }

    @DeleteMapping("/{id}")
    public void deletarPedido(@PathVariable Long id){
        pedidoService.deletarPedido(id);
    }
}
