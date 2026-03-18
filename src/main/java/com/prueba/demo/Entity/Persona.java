
package com.prueba.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author JAMES
 */
@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String apellido;
    private Integer edad;
    
    //Implementacion de la relacion uno a uno para la clase mascota
    @OneToOne
    @JoinColumn (name = "una_mascota_id_mascota", referencedColumnName = "id_mascota")
    private Mascota unaMascota;

    public Persona(Long id, String nombre, String apellido, Integer edad, Mascota unaMascota) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.unaMascota = unaMascota;
    }

    
    
}
