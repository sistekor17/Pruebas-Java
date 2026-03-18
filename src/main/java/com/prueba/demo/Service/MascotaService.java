/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.demo.Service;

import com.prueba.demo.Entity.Mascota;
import com.prueba.demo.Repository.IMascotaRepository;
import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author JAMES
 */
@Service
public class MascotaService implements IMascotaService {

    @Autowired
    IMascotaRepository mascotaRepo;

    @Override
    public List<Mascota> getMascotas() {
        List<Mascota> listaMascotas = mascotaRepo.findAll();
        return listaMascotas;
    }

    @Override
    public void saveMascota(Mascota mascota) {
        mascotaRepo.save(mascota);
    }

    @Override
    public void deleteMascota(Long id) {
        mascotaRepo.deleteById(id);
    }

    @Override
    public Mascota findMascota(Long id) {
        Mascota mascota = mascotaRepo.findById(id).orElse(null);
        return mascota;
    }

    @Override
    public void updateMascota(Long id, Mascota upDateMascota) {
        Mascota mascota = mascotaRepo.findById(id).orElseThrow(() -> new NoSuchElementException("No se encuentra el perfil con el id: " + id));
        
        mascota.setNombre(upDateMascota.getNombre() != null ? upDateMascota.getNombre() : mascota.getNombre());
        mascota.setEspecie(upDateMascota.getEspecie()!= null ? upDateMascota.getEspecie(): mascota.getEspecie());
        mascota.setRaza(upDateMascota.getRaza() != null ? upDateMascota.getRaza(): mascota.getRaza());
        mascota.setColor(upDateMascota.getColor() != null ? upDateMascota.getColor() : mascota.getColor());

        this.saveMascota(mascota);
    }

}
