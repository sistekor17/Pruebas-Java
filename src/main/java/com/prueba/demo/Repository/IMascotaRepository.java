
package com.prueba.demo.Repository;

import com.prueba.demo.Entity.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author JAMES
 */
@Repository
public interface IMascotaRepository extends JpaRepository<Mascota, Long> {
    
}
