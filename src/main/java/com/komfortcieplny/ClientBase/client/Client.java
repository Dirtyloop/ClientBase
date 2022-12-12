package com.komfortcieplny.ClientBase.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String street;
    private String city;
    private String postalCode;
    private String acBrand;
    private String acModel;
    private double acPower;
    private String refrigerant;
    private String acCode;
    private LocalDate dateOfInstalation;
    private boolean inspected;
}
