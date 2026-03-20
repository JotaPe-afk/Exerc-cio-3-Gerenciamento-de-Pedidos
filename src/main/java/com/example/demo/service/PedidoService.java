package com.example.demo.service;

import com.example.demo.entity.models.PedidoModel;
import com.example.demo.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public PedidoModel criarPedido(PedidoModel pedidoModel) {
        return pedidoRepository.save(pedidoModel);
    }

    public List<PedidoModel> listarPedidos(){
        return pedidoRepository.findAll();
    }

    public PedidoModel buscarPedido(Long id){
        return pedidoRepository.findById(id).get();
    }

    public void deletarPedido(Long id){
        pedidoRepository.deleteById(id);
    }
}
