/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.melinatheill.mgb.Controller;


import com.melinatheill.mgb.Dto.dtoExperiencia;
import com.melinatheill.mgb.Entity.Experiencia;
import com.melinatheill.mgb.Service.SExperiencia;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("explab")
@CrossOrigin (origins = "http://localhost:4200")
public class CExperiencia {
    @Autowired
    SExperiencia sExperiencia;
    public ResponseEntity <List< Experiencia  >> list (){
        List <Experiencia> list = sExperiencia.list ();
        return new ResponseEntity (list,HttpStatus.OK);
    }
  public ResponseEntity<?> create (@RequestBody dtoExperiencia dtoexp){
  if (StringUtils.isBlank(dtoexp.getNombreE()))
      return new ResponseEntity (new Mensaje ("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
  }
}
