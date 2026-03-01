
package com.prueba.demo.Controller;

import com.prueba.demo.Service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author JAMES
 */
@RestController
public class PersonaController {
    
    @Autowired
    private IPersonaService iPersonaService;
    
}
