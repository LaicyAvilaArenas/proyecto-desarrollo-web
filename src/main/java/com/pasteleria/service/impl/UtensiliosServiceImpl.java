package com.pasteleria.service.impl;

import com.pasteleria.Dao.UtensiliosDao;
import com.pasteleria.domain.Utensilios;
import com.pasteleria.service.UtensiliosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UtensiliosServiceImpl implements UtensiliosService {
   
    
    @Autowired
    private UtensiliosDao utensiliosDao;
  
    @Transactional(readOnly = true)
    public List<Utensilios> getUtensilios() {
        var lista = utensiliosDao.findAll();
        
        return lista;
    }

    @Override   
    @Transactional(readOnly = true)
    public Utensilios getUtensilios(Utensilios utensilios) {
        return utensiliosDao.findById(utensilios.getNumero_utensilios()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Utensilios utensilios) {
        utensiliosDao.save(utensilios);
    }

    @Override
    @Transactional
    public void delete(Utensilios utensilios) {
        utensiliosDao.delete(utensilios);
    }
   
}
