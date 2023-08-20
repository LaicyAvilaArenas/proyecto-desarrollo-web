package com.pasteleria.service.impl;

import com.pasteleria.Dao.CategoriasDao;
import com.pasteleria.domain.Categorias;
import com.pasteleria.service.CategoriasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoriasServiceImpl implements CategoriasService {
   
    
    @Autowired
    private CategoriasDao categoriasDao;
  
    @Transactional(readOnly = true)
    public List<Categorias> getCategorias() {
        var lista = categoriasDao.findAll();
        
        return lista;
    }

    @Override   
    @Transactional(readOnly = true)
    public Categorias getCategorias(Categorias categorias) {
        return categoriasDao.findById(categorias.getNumero_categoria()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Categorias categorias) {
        categoriasDao.save(categorias);
    }

    @Override
    @Transactional
    public void delete(Categorias categorias) {
        categoriasDao.delete(categorias);
    }
   
}
