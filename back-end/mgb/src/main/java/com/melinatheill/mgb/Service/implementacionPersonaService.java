/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.melinatheill.mgb.Service;

import com.melinatheill.mgb.Interface.IPersonaService;
import com.melinatheill.mgb.entity.Persona;
import com.melinatheill.mgb.repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class implementacionPersonaService implements IPersonaService{
@Autowired IPersonaRepository ipersonarepository;
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonarepository.findAll();
                return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonarepository.save(persona);
    }
    

    @Override
    public void deletePersona(Long id) {
        ipersonarepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
      Persona persona = ipersonarepository.findById(id).orElse(null);
              return persona;
    }
    
}
