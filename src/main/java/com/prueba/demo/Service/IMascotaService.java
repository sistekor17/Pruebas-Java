/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.prueba.demo.Service;

import com.prueba.demo.Entity.Mascota;
import java.util.List;

/**
 *
 * @author JAMES
 */
public interface IMascotaService {
    //Metodo para traer una lista de Mascotas
    public List<Mascota>getMascotas();
    
    //Metodo para dar de alta una Mascota
    public void saveMascota (Mascota mascota);
    
    //Metodo para borrar una Mascota
    public void deleteMascota(Long id);
    
    //Metodo para encontrar una Mascota
    public Mascota findMascota(Long id);
    
    //Metodo para modificar una Mascota
    public void updateMascota(Long id, Mascota upDateMascota);
}
