package com.tecsup.petclinic.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Vet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

    public Vet(){    }


    public Vet(Integer id, String firstName, String lastName){
        super();
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public Vet(String firstName, String lastName){
        super();
        this.firstName=firstName;
        this.lastName=lastName;
    }
}
