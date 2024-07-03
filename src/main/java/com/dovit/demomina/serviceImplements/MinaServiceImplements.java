package com.dovit.demomina.serviceImplements;

import com.dovit.demomina.entities.Mina;
import com.dovit.demomina.repositories.MinaRepository;
import com.dovit.demomina.serviceInterface.MinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MinaServiceImplements implements MinaService {

    @Autowired
    private MinaRepository minaRepository;

    @Override
    public Mina findById(Long id) {
        return minaRepository.findById(id).orElse(new Mina());
    }

    @Override
    public List<Mina> findAll() {
        return minaRepository.findAll();
    }

    @Override
    public Mina Create(Mina mina) {
        return minaRepository.save(mina);
    }

    @Override
    public void deleteById(Long id) {
        minaRepository.deleteById(id);
    }

    @Override
    public Mina update(Mina mina) {
        return minaRepository.save(mina);
    }
}
