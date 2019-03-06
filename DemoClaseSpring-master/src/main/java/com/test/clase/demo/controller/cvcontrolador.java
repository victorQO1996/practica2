package com.test.clase.demo.controller;
import com.test.clase.demo.model.curriculum;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RestController
@RequestMapping("/cv2")


public class cvcontrolador {
    @GetMapping(value = "/datos")
   public String obtenerDatos(Model model){

        curriculum cv = new curriculum();


        cv.setNombre("victor quintero ortiz ");

        cv.setFechaNacimiento("19/11/1996");
        cv.setEdad(22);
        cv.setDireccion("ejido cucapah indigena");
        cv.setCuidad("mexicali");
        cv.setEstadoCivil("soltero");

        cv.setGradoEscolar("universidad");
        cv.setConocimientos("informativca para ificinas, programacion ( c, c#, java, html), contabilidad, administracion de empresas");
        cv.setEscuela("UABC");
        cv.setIdiomas("español, ingles 40%");

        cv.setEmpresa("financiera");
        cv.setPuesto("gerente general");
        cv.setDescripcion("realizaba labores admiistrativas, asi como una parte de la contabilidad ");



        model.addAttribute("cv2",cv);

       return "cv2";
   }

   /*
   @Controller
@RequestMapping("/cv");
public class CVController){

@GetMapping(value="/dato")
public String obtenerDatos(Model){

CurriculumVita vitae = new Curriculum Vitae();

vitae.setApellidoMaterno("Tlaco");
vitae.setApellidoPaterno("Ramires):
vitae.setNombre("

}
   */

}
