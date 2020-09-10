package com.sigit.demo.entity;

import javax.persistence.*;

/**
 * Date 07/09/20
 *
 * @author sigit
 */

@Entity
@Table(name = "user", schema = "public")
public class User {

    private static final long serialVersionUID = 840653253546680290L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String country;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
