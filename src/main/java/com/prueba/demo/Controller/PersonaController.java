
package com.prueba.demo.Controller;

import com.prueba.demo.Entity.Persona;
import com.prueba.demo.Service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author JAMES
 */
@RestController
public class PersonaController {
    
    @Autowired
    private IPersonaService iPersonaService;
    
    //Endpoint para traer una lista de personas
    @GetMapping("/personas/traer")
    public List<Persona> getListaPersonas(){
        return iPersonaService.getPersonas();
    }
    
    //Endpoint para crear una persona nueva.
    @PostMapping("personas/crear")
    public String postPersona(@RequestBody Persona persona){
        iPersonaService.savePersona(persona);
        return "La Persona ha sido creada conrrectamente";
    }
    
    // Endpoint para borrar una persona mediante el id+
    @DeleteMapping("personas/borrar/{id}")
    public String deleteIdPersona(@PathVariable Long id){
        iPersonaService.deletePersona(id);
        return "La persona con ha sido borrada";
    }
    
    //Endpoint para modificar a una persona
    @PutMapping("personas/editar/{id}")
    public String editProfile(@PathVariable long id,
                              @RequestBody Persona updatePersona){
        iPersonaService.updatePerso(id, updatePersona);
        return "Los datos han sido actualizada";
    }
}
