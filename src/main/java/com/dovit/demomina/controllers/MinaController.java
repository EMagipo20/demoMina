package com.dovit.demomina.controllers;

import com.dovit.demomina.dtos.MinaDto;
import com.dovit.demomina.entities.Mina;
import com.dovit.demomina.serviceImplements.MinaServiceImplements;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/minas")
public class MinaController {

    private final MinaServiceImplements mS;

    public MinaController(MinaServiceImplements minaService) {
        this.mS = minaService;
    }

    @GetMapping("/ListarTodo")
    public List<Mina> getAll() {
        return mS.findAll();
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<Mina> getById(@PathVariable Long id) {
        Mina mina = mS.findById(id);
        if (mina == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(mina);
    }

    @PostMapping("/Agregar")
    public ResponseEntity<Mina> create(@RequestBody MinaDto dto) {
        Mina mina = new Mina();
        mina.setNombreMina(dto.getNombreMina());
        mina.setFechaInicioOperacion(dto.getFechaInicioOperacion());
        mina.setTipo(dto.getTipo());
        mina.setToneladasProducidas(dto.getToneladasProducidas());
        Mina save = mS.Create(mina);
        return ResponseEntity.ok(save);
    }

    @PutMapping("Actualizar/{codigo}")
    public ResponseEntity<Mina> update(@PathVariable Long codigo, @RequestBody  MinaDto dto) {
        Mina mina = mS.findById(codigo);
        if (mina == null) {
            return ResponseEntity.notFound().build();
        }
        mina.setNombreMina(dto.getNombreMina());
        mina.setTipo(dto.getTipo());
        mina.setToneladasProducidas(dto.getToneladasProducidas());
        Mina updated = mS.update(mina);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{codigo}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        mS.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
