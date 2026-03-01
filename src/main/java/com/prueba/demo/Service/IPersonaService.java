/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.prueba.demo.Service;

import com.prueba.demo.Entity.Persona;
import java.util.List;

/**
 *
 * @author JAMES
 */
public interface IPersonaService {
    
    //Metodo para traer una lista de personas
    public List<Persona>getPersonas();
    
    //Metodo para dar de alta una persona
    public void savePersona (Persona perso);
    
    //Metodo para borrar una persona
    public void deletePersona(Long id);
    
    //Metodo para encontrar una persona
    public Persona findPersona(Long id);
    
    //Metodo para modificar una persona
    public Persona updatePerso(Long id, Persona upDatePersona);
}
