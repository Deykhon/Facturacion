package com.tuempresa.facturacion.modelo;

import javax.persistence.*;

import lombok.*;


//clase incrustada, es decir no es una entidad y si se borra  un cliente tambien se borrará su direccion
@Embeddable // Usamos @Embeddable en vez de @Entity
@Getter @Setter
public class Direccion {
 
    @Column(length = 30) // Los miembros se anotan igual que en las entidades
    String viaPublica;
 
    @Column(length = 5)
    int codigoPostal;
 
    @Column(length = 20)
    String municipio;
 
    @Column(length = 30)
    String provincia;
 
}