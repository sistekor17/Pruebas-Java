/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.demo.Service;

import com.prueba.demo.Entity.Persona;
import com.prueba.demo.Repository.IPersonaRepository;
import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author JAMES
 */
@Service
public class PersonaService implements IPersonaService {
    @Autowired
    private IPersonaRepository personaRepository;

    @Override
    public List<Persona> getPersonas() {
        List<Persona> listaPersonas = personaRepository.findAll();
        return listaPersonas;
    }

    @Override
    public void savePersona(Persona perso) {
        personaRepository.save(perso);
    }

    @Override
    public void deletePersona(Long id) {
        personaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona perso = personaRepository.findById(id).orElse(null);
        return perso;
    }

    @Override
    public Persona updatePerso(Long id, Persona upDatePersona) {
        
       Persona  persona =  personaRepository.findById(id).orElseThrow(()-> new NoSuchElementException("No se encuentra el perfil con el id: "+ id ));
       
        persona.setNombre(upDatePersona.getNombre()!= null ? upDatePersona.getNombre():persona.getNombre());
        persona.setApellido(upDatePersona.getApellido() != null ? upDatePersona.getApellido() : persona.getApellido());
        persona.setEdad(upDatePersona.getEdad() != null ? upDatePersona.getEdad() : persona.getEdad());
        
        return persona;
       
         
    }


}
