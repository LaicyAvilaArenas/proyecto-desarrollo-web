package com.pasteleria.service.impl;

import com.pasteleria.Dao.ProductosDao;
import com.pasteleria.domain.Productos;
import com.pasteleria.service.ProductosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductosServiceImpl implements ProductosService {
   
    
    @Autowired
    private ProductosDao productosDao;
  
    @Transactional(readOnly = true)
    public List<Productos> getProductos() {
        var lista = productosDao.findAll();
        
        return lista;
    }

    @Override   
    @Transactional(readOnly = true)
    public Productos getProductos(Productos productos) {
        return productosDao.findById(productos.getNumero_productos()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Productos productos) {
        productosDao.save(productos);
    }

    @Override
    @Transactional
    public void delete(Productos productos) {
        productosDao.delete(productos);
    }
   
}
