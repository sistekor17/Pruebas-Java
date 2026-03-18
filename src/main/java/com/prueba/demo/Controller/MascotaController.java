
package com.prueba.demo.Controller;


import com.prueba.demo.Entity.Mascota;
import com.prueba.demo.Service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author JAMES
 */
@RestController
public class MascotaController {
    
    @Autowired
    private IMascotaService mascotaService;
    
    @PostMapping ("/mascotas/crear")
    public String saveMascota(@RequestBody Mascota mascota){
        mascotaService.saveMascota(mascota);
        return "La mascota se ha guardado correctamente.";
    }
}
