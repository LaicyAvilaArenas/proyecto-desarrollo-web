package com.pasteleria.service.impl;

import com.pasteleria.Dao.FinanzasDao;
import com.pasteleria.domain.Finanzas;
import com.pasteleria.service.FinanzasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FinanzasServiceImpl implements FinanzasService {
   
    
    @Autowired
    private FinanzasDao finanzasDao;
  
    @Transactional(readOnly = true)
    public List<Finanzas> getFinanzas() {
        var lista = finanzasDao.findAll();
        
        return lista;
    }

    @Override   
    @Transactional(readOnly = true)
    public Finanzas getFinanzas(Finanzas finanzas) {
        return finanzasDao.findById(finanzas.getNumero_mes()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Finanzas finanzas) {
        finanzasDao.save(finanzas);
    }

    @Override
    @Transactional
    public void delete(Finanzas finanzas) {
        finanzasDao.delete(finanzas);
    }
   
}
