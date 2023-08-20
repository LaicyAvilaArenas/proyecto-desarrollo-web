package com.pasteleria.service.impl;

import com.pasteleria.Dao.PastelesDao;
import com.pasteleria.domain.Pasteles;
import com.pasteleria.service.PastelesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PastelesServiceImpl implements PastelesService {
   
    
    @Autowired
    private PastelesDao pastelesDao;
  
    @Transactional(readOnly = true)
    public List<Pasteles> getPasteles() {
        var lista = pastelesDao.findAll();
        
        return lista;
    }

    @Override   
    @Transactional(readOnly = true)
    public Pasteles getPasteles(Pasteles pasteles) {
        return pastelesDao.findById(pasteles.getNumero_pastel()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Pasteles pasteles) {
        pastelesDao.save(pasteles);
    }

    @Override
    @Transactional
    public void delete(Pasteles pasteles) {
        pastelesDao.delete(pasteles);
    }
   
}
