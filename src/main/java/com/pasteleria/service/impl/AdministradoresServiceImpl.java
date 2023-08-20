package com.pasteleria.service.impl;

import com.pasteleria.Dao.AdministradoresDao;
import com.pasteleria.domain.Administradores;
import com.pasteleria.service.AdministradoresService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AdministradoresServiceImpl implements AdministradoresService {
   
    
    @Autowired
    private AdministradoresDao administradoresDao;
  
    @Transactional(readOnly = true)
    public List<Administradores> getAdministradores() {
        var lista = administradoresDao.findAll();
        
        return lista;
    }

    @Override   
    @Transactional(readOnly = true)
    public Administradores getAdministradores(Administradores administradores) {
        return administradoresDao.findById(administradores.getNumero_admin()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Administradores administradores) {
        administradoresDao.save(administradores);
    }

    @Override
    @Transactional
    public void delete(Administradores administradores) {
        administradoresDao.delete(administradores);
    }
   
}
