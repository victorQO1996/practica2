package com.test.clase.demo.model;

import lombok.Data;

@Data
public class vitae {


    //datos personales
    private String nombre;
    private String fechaNacimiento;
    private int edad;
    private String direccion;
    private String cuidad;
    private String estadoCivil;

    //datos escolares
    private String gradoEscolar;
    private String conocimientos;
    private String escuela;
    private String idiomas;

    //experiencia laboral
    private String empresa;
    private String puesto;
    private String descripcion;

}
