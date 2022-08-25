/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.melinatheill.mgb.Controller;

import com.melinatheill.mgb.Interface.IPersonaService;
import com.melinatheill.mgb.entity.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
        
public class PersonaControler {
    @Autowired IPersonaService ipersonaservice;
    @GetMapping ("personas/traer")
    public List<Persona> getPersona () {
        return ipersonaservice.getPersona();
    }
    

    @PostMapping ("/personas/crear")
    
    public String createPersona ( @RequestBody Persona persona){
            ipersonaservice.savePersona(persona);
            return "la persona se ha creado ";
                    }
    @DeleteMapping ("/personas/borrar/{id}")
    public String deletePersona (@PathVariable Long id){
        return "la persona ha eliminado";
    }
            
    @PutMapping("/personas/editar/{id}") 
    public Persona editPersona (@PathVariable Long Id,
            @RequestParam ("nombre") String nuevoNombre,
            @RequestParam ("apellido") String nuevoApellido,
            @RequestParam ("img") String nuevoImg) {
        Persona persona = ipersonaservice.findPersona(Id);
                persona.setName(nuevoNombre);
                persona.setApellido(nuevoApellido);
                persona.getImg();
        ipersonaservice.savePersona(persona);
        return persona;
    }
    
    
}
