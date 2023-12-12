package com.klu.agri.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "contactus")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ContactUs {
    @Column(name = "name")
    private String name;
    private String email;
    @Id
    private String message;
}
