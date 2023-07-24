package com.pasteleria.service.impl;

import com.pasteleria.Dao.PedidosDao;
import com.pasteleria.domain.Pedidos;
import com.pasteleria.service.PedidosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PedidosServiceImpl implements PedidosService {
   
    
    @Autowired
    private PedidosDao pedidosDao;
  
    @Transactional(readOnly = true)
    public List<Pedidos> getPedidos() {
        var lista = pedidosDao.findAll();
        
        return lista;
    }

    @Override   
    @Transactional(readOnly = true)
    public Pedidos getPedidos(Pedidos pedidos) {
        return pedidosDao.findById(pedidos.getNumero_pedido()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Pedidos pedidos) {
        pedidosDao.save(pedidos);
    }

    @Override
    @Transactional
    public void delete(Pedidos pedidos) {
        pedidosDao.delete(pedidos);
    }
   
}
