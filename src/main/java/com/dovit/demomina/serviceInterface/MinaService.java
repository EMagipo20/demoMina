package com.dovit.demomina.serviceInterface;

import com.dovit.demomina.entities.Mina;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MinaService {
    public List<Mina> findAll();
    public Mina findById(Long idMina);
    public Mina Create(Mina mina);
    public void deleteById(Long idMina);
    public Mina update(Mina mina);
}
