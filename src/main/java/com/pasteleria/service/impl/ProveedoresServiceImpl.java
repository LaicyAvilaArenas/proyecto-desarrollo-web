package com.pasteleria.service.impl;

import com.pasteleria.Dao.ProveedoresDao;
import com.pasteleria.domain.Proveedores;
import com.pasteleria.service.ProveedoresService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProveedoresServiceImpl implements ProveedoresService {
   
    
    @Autowired
    private ProveedoresDao proveedoresDao;
  
    @Transactional(readOnly = true)
    public List<Proveedores> getProveedores() {
        var lista = proveedoresDao.findAll();
        
        return lista;
    }

    @Override   
    @Transactional(readOnly = true)
    public Proveedores getProveedores(Proveedores proveedores) {
        return proveedoresDao.findById(proveedores.getNumero_proveedor()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Proveedores proveedores) {
        proveedoresDao.save(proveedores);
    }

    @Override
    @Transactional
    public void delete(Proveedores proveedores) {
        proveedoresDao.delete(proveedores);
    }
   
}
