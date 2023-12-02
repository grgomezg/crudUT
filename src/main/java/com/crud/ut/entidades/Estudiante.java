package com.crud.ut.entidades;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

@Data
@Entity
@Table(name = "estudiantes")
public class Estudiante {

@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "nombres",nullable = false,length = 50)
    private String nombres;

    @Column(name = "apellidos",nullable = false,length = 50)
    private String apellidos;

    @Column(name = "email",nullable = false,length = 50,unique = true)
    private String email;

    @Column(name = "identificacion", nullable = false, length = 50, unique = true)
    private  String identificacion;





}

