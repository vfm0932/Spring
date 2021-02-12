package com.example.abm.servicio;

import com.example.abm.dao.PersonaDAO;
import com.example.abm.modelo.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {
    @Autowired
    private PersonaDAO personadao;

    @Override
    @Transactional(readOnly = true)
    public List<Persona> listarPersonas() {
        return (List<Persona>) personadao.findAll();

    }

    @Override
    @Transactional
    public void guardar(Persona persona) {
        personadao.save(persona);
    }

    @Override
    @Transactional
    public void eliminar(Persona persona) {
        personadao.delete(persona);
    }

    @Override
    @Transactional(readOnly = true)
    public Persona encontrarPersona(Persona persona) {
        return personadao.findById(persona.getId()).orElse(null);
    }


}

