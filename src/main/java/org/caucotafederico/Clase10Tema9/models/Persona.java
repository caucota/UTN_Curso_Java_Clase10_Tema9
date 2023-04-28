package org.caucotafederico.Clase10Tema9.models;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Persona {
    private String apellido;
    private String nombre;
    private LocalDate fechaNacimiento;
}
